# Ôn thi GPLX Việt Nam - Monorepo

## Cấu trúc
- `backend/`: Spring Boot + PostgreSQL + Flyway
- `frontend/`: Angular + TailwindCSS

## Chạy nhanh local
### 1) Khởi động PostgreSQL
```bash
docker compose up -d
```

### 2) Chạy backend
```bash
cd backend
./mvnw spring-boot:run
```
> Nếu chưa có `mvnw`, dùng `mvn spring-boot:run`.

Backend mặc định chạy ở `http://localhost:8080`.

### 3) Chạy frontend
```bash
cd frontend
npm install
npm start
```

Frontend mặc định chạy ở `http://localhost:4200`.

## API mẫu
- `GET /api/health`
- `POST /api/auth/register`
- `POST /api/auth/login`
- `GET /api/exam-sets`
