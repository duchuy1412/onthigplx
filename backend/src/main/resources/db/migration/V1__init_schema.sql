CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    full_name VARCHAR(120),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS questions (
    id BIGSERIAL PRIMARY KEY,
    license_type VARCHAR(10) NOT NULL,
    content TEXT NOT NULL,
    explanation TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS question_options (
    id BIGSERIAL PRIMARY KEY,
    question_id BIGINT NOT NULL REFERENCES questions(id) ON DELETE CASCADE,
    option_label VARCHAR(2) NOT NULL,
    option_text TEXT NOT NULL,
    is_correct BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO questions (license_type, content, explanation)
VALUES
('A1', 'Biển nào cấm xe mô tô hai bánh đi vào?', 'Chọn biển có ký hiệu cấm mô tô.'),
('B2', 'Khi điều khiển xe qua ngã tư, người lái xe cần làm gì?', 'Giảm tốc độ, quan sát và nhường đường đúng quy định.');
