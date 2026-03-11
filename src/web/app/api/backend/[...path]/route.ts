import { NextRequest } from "next/server";

type RouteContext = {
  params: Promise<{
    path: string[];
  }>;
};

export const runtime = "nodejs";
export const dynamic = "force-dynamic";

function getBackendBaseUrl() {
  return process.env.LUCKY5_API_BASE_URL ?? "http://127.0.0.1:5000";
}

async function forward(request: NextRequest, context: RouteContext) {
  const { path } = await context.params;
  const targetUrl = new URL(path.join("/"), `${getBackendBaseUrl()}/`);
  targetUrl.search = request.nextUrl.search;

  const headers = new Headers();
  const authorization = request.headers.get("authorization");
  const contentType = request.headers.get("content-type");

  if (authorization) {
    headers.set("authorization", authorization);
  }

  if (contentType) {
    headers.set("content-type", contentType);
  }

  const method = request.method;
  const body =
    method === "GET" || method === "HEAD" ? undefined : await request.text();

  const upstream = await fetch(targetUrl, {
    method,
    headers,
    body,
    cache: "no-store",
  });

  const responseHeaders = new Headers();
  const upstreamContentType = upstream.headers.get("content-type");

  if (upstreamContentType) {
    responseHeaders.set("content-type", upstreamContentType);
  }

  return new Response(await upstream.arrayBuffer(), {
    status: upstream.status,
    headers: responseHeaders,
  });
}

export async function GET(request: NextRequest, context: RouteContext) {
  return forward(request, context);
}

export async function POST(request: NextRequest, context: RouteContext) {
  return forward(request, context);
}
