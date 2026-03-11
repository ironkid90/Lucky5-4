-- 001_initial_schema.sql
-- Bootstrap relational schema for Lucky5 clean-room backend.

CREATE TABLE IF NOT EXISTS users (
  id UUID PRIMARY KEY,
  username VARCHAR(100) UNIQUE NOT NULL,
  password_hash TEXT NOT NULL,
  phone_number VARCHAR(30) NOT NULL,
  is_otp_verified BOOLEAN NOT NULL DEFAULT FALSE,
  created_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS members (
  user_id UUID PRIMARY KEY REFERENCES users(id),
  display_name VARCHAR(120) NOT NULL,
  email VARCHAR(200),
  wallet_balance NUMERIC(18,2) NOT NULL DEFAULT 0,
  last_seen_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS machines (
  id INT PRIMARY KEY,
  name VARCHAR(120) NOT NULL,
  is_open BOOLEAN NOT NULL DEFAULT TRUE,
  min_bet NUMERIC(18,2) NOT NULL,
  max_bet NUMERIC(18,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS rounds (
  round_id UUID PRIMARY KEY,
  user_id UUID NOT NULL REFERENCES users(id),
  machine_id INT NOT NULL REFERENCES machines(id),
  bet_amount NUMERIC(18,2) NOT NULL,
  hand_rank VARCHAR(50),
  win_amount NUMERIC(18,2) NOT NULL DEFAULT 0,
  is_completed BOOLEAN NOT NULL DEFAULT FALSE,
  created_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS cards (
  id BIGSERIAL PRIMARY KEY,
  round_id UUID NOT NULL REFERENCES rounds(round_id),
  phase VARCHAR(20) NOT NULL,
  card_index INT NOT NULL,
  rank VARCHAR(5) NOT NULL,
  suit VARCHAR(2) NOT NULL
);

CREATE TABLE IF NOT EXISTS wallet_ledger (
  id UUID PRIMARY KEY,
  user_id UUID NOT NULL REFERENCES users(id),
  amount NUMERIC(18,2) NOT NULL,
  balance_after NUMERIC(18,2) NOT NULL,
  type VARCHAR(50) NOT NULL,
  reference VARCHAR(120) NOT NULL,
  created_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS transfers (
  id UUID PRIMARY KEY,
  user_id UUID NOT NULL REFERENCES users(id),
  direction VARCHAR(40) NOT NULL,
  amount NUMERIC(18,2) NOT NULL,
  reference VARCHAR(120) NOT NULL,
  created_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS offers (
  id INT PRIMARY KEY,
  title VARCHAR(120) NOT NULL,
  description TEXT NOT NULL,
  bonus_amount NUMERIC(18,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS app_settings (
  key VARCHAR(120) PRIMARY KEY,
  value TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS terms (
  version VARCHAR(50) PRIMARY KEY,
  body_markdown TEXT NOT NULL,
  updated_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS contact_types (
  id INT PRIMARY KEY,
  name VARCHAR(120) NOT NULL
);

CREATE TABLE IF NOT EXISTS contact_reports (
  id UUID PRIMARY KEY,
  user_id UUID NOT NULL REFERENCES users(id),
  contact_type_id INT NOT NULL REFERENCES contact_types(id),
  subject VARCHAR(200) NOT NULL,
  message TEXT NOT NULL,
  created_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS otp_codes (
  id UUID PRIMARY KEY,
  user_id UUID NOT NULL REFERENCES users(id),
  otp_code VARCHAR(12) NOT NULL,
  expires_utc TIMESTAMPTZ NOT NULL,
  consumed_utc TIMESTAMPTZ
);

CREATE TABLE IF NOT EXISTS idempotency_keys (
  key VARCHAR(120) PRIMARY KEY,
  user_id UUID NOT NULL REFERENCES users(id),
  endpoint VARCHAR(120) NOT NULL,
  created_utc TIMESTAMPTZ NOT NULL DEFAULT NOW()
);
