import type {
  ApiEnvelope,
  AuthTokens,
  DealResult,
  DefaultRules,
  DoubleUpResult,
  DrawResult,
  MachineListing,
  MachineState,
  MemberProfile,
  WalletLedgerEntry,
} from "@/lib/types";

type LoginPayload = {
  tokens: AuthTokens;
  profile: MemberProfile;
};

async function request<T>(
  path: string,
  init?: RequestInit,
  accessToken?: string,
) {
  const headers = new Headers(init?.headers);
  headers.set("accept", "application/json");

  if (accessToken) {
    headers.set("authorization", `Bearer ${accessToken}`);
  }

  if (init?.body && !headers.has("content-type")) {
    headers.set("content-type", "application/json");
  }

  const response = await fetch(`/api/backend/${path}`, {
    ...init,
    headers,
    cache: "no-store",
  });

  const json = (await response.json()) as ApiEnvelope<T>;

  if (!response.ok || !json.success) {
    throw new Error(json.message || "Lucky5 backend request failed");
  }

  return json.data;
}

export async function signup(
  username: string,
  password: string,
  phoneNumber: string,
) {
  return request<MemberProfile>("api/Auth/signup", {
    method: "POST",
    body: JSON.stringify({ username, password, phoneNumber }),
  });
}

export async function verifyOtp(username: string, otpCode: string) {
  return request("api/Auth/verify-otp", {
    method: "POST",
    body: JSON.stringify({ username, otpCode }),
  });
}

export async function login(username: string, password: string) {
  return request<LoginPayload>("api/Auth/login", {
    method: "POST",
    body: JSON.stringify({ username, password }),
  });
}

export async function getProfile(accessToken: string) {
  return request<MemberProfile>("api/Auth/GetUserById", undefined, accessToken);
}

export async function getMemberHistory(accessToken: string) {
  return request<WalletLedgerEntry[]>(
    "api/Auth/MemberHistory",
    undefined,
    accessToken,
  );
}

export async function listMachines(accessToken: string) {
  return request<MachineListing[]>(
    "api/Game/games/machines",
    undefined,
    accessToken,
  );
}

export async function getDefaultRules() {
  return request<DefaultRules>("api/Game/defaultRules");
}

export async function deal(
  machineId: number,
  betAmount: number,
  accessToken: string,
) {
  return request<DealResult>(
    "api/Game/cards/deal",
    {
      method: "POST",
      body: JSON.stringify({ machineId, betAmount }),
    },
    accessToken,
  );
}

export async function draw(
  roundId: string,
  holdIndexes: number[],
  accessToken: string,
) {
  return request<DrawResult>(
    "api/Game/cards/draw",
    {
      method: "POST",
      body: JSON.stringify({ roundId, holdIndexes }),
    },
    accessToken,
  );
}

export async function getMachineState(machineId: number, accessToken: string) {
  return request<MachineState>(
    `api/Game/machine/${machineId}/state`,
    undefined,
    accessToken,
  );
}

export async function startDoubleUp(roundId: string, accessToken: string) {
  return request<DoubleUpResult>(
    "api/Game/double-up/start",
    {
      method: "POST",
      body: JSON.stringify({ roundId }),
    },
    accessToken,
  );
}

export async function switchDealer(roundId: string, accessToken: string) {
  return request<DoubleUpResult>(
    "api/Game/double-up/switch",
    {
      method: "POST",
      body: JSON.stringify({ roundId }),
    },
    accessToken,
  );
}

export async function guessDoubleUp(
  roundId: string,
  guess: "big" | "small",
  accessToken: string,
) {
  return request<DoubleUpResult>(
    "api/Game/double-up/guess",
    {
      method: "POST",
      body: JSON.stringify({ roundId, guess }),
    },
    accessToken,
  );
}

export async function cashoutDoubleUp(roundId: string, accessToken: string) {
  return request<DoubleUpResult>(
    "api/Game/double-up/cashout",
    {
      method: "POST",
      body: JSON.stringify({ roundId }),
    },
    accessToken,
  );
}

export async function takeHalf(roundId: string, accessToken: string) {
  return request<DoubleUpResult>(
    "api/Game/double-up/take-half",
    {
      method: "POST",
      body: JSON.stringify({ roundId }),
    },
    accessToken,
  );
}
