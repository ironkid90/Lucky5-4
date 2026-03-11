-- 002_seed.sql
INSERT INTO machines (id, name, is_open, min_bet, max_bet) VALUES
  (1, 'Lucky 5 - Beirut', TRUE, 1, 10),
  (2, 'Lucky 5 - Hamra', TRUE, 1, 20),
  (3, 'Lucky 5 - VIP', TRUE, 5, 50)
ON CONFLICT (id) DO NOTHING;

INSERT INTO offers (id, title, description, bonus_amount) VALUES
  (1, 'Welcome Bonus', 'First deposit bonus', 10),
  (2, 'Weekend Cashback', '5% cashback on losses', 5)
ON CONFLICT (id) DO NOTHING;

INSERT INTO app_settings (key, value) VALUES
  ('game.houseRulesetVersion', 'v1'),
  ('signalr.heartbeatSeconds', '20'),
  ('wallet.currency', 'USD')
ON CONFLICT (key) DO NOTHING;

INSERT INTO contact_types (id, name) VALUES
  (1, 'Technical'),
  (2, 'Billing'),
  (3, 'General')
ON CONFLICT (id) DO NOTHING;

INSERT INTO terms (version, body_markdown, updated_utc) VALUES
  ('1.0.0', '# Terms\n\nUse this clean-room build for testing and internal validation only.', NOW())
ON CONFLICT (version) DO NOTHING;
