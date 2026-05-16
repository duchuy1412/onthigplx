import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter } from '@angular/router';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  standalone: true,
  template: `
    <main class="min-h-screen bg-slate-50 text-slate-900">
      <header class="bg-blue-700 text-white p-4 shadow">
        <h1 class="text-xl font-semibold">Ôn thi giấy phép lái xe trực tuyến</h1>
        <p class="text-sm opacity-90">Nền tảng ôn thi GPLX tại Việt Nam (MVP)</p>
      </header>

      <section class="max-w-5xl mx-auto px-4 py-8 grid gap-4 md:grid-cols-3">
        <article class="bg-white rounded-xl shadow p-5" *ngFor="let item of features">
          <h2 class="font-semibold text-lg mb-2">{{ item.title }}</h2>
          <p class="text-sm text-slate-600">{{ item.desc }}</p>
        </article>
      </section>
    </main>
  `
})
class AppComponent {
  features = [
    { title: 'Thi thử theo hạng bằng', desc: 'A1, B1, B2 với bộ đề mô phỏng.' },
    { title: 'Chấm điểm tức thì', desc: 'Hiển thị kết quả và giải thích đáp án ngay sau khi nộp bài.' },
    { title: 'Lịch sử học tập', desc: 'Theo dõi tiến trình ôn tập qua từng lần thi.' }
  ];
}

bootstrapApplication(AppComponent, {
  providers: [provideRouter([])]
}).catch((err) => console.error(err));
