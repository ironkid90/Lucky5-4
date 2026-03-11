import type { Metadata } from "next";
import { IBM_Plex_Sans_Condensed, Press_Start_2P } from "next/font/google";

import "./globals.css";

const displayFont = Press_Start_2P({
  weight: "400",
  variable: "--font-display",
  subsets: ["latin"],
});

const bodyFont = IBM_Plex_Sans_Condensed({
  weight: ["400", "500", "600", "700"],
  variable: "--font-body",
  subsets: ["latin"],
});

export const metadata: Metadata = {
  title: "Lucky5 Cabinet Lab",
  description: "Web-first Lucky5 cabinet frontend for clean-room engine testing.",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className={`${displayFont.variable} ${bodyFont.variable}`}>
        {children}
      </body>
    </html>
  );
}
