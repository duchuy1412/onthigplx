package com.onthi.gplx.exam;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exam-sets")
public class ExamSetController {

    @GetMapping
    public List<Map<String, Object>> examSets() {
        return List.of(
            Map.of("id", 1, "name", "Đề A1 - Cơ bản 1", "licenseType", "A1", "questionCount", 25),
            Map.of("id", 2, "name", "Đề B2 - Mô phỏng 1", "licenseType", "B2", "questionCount", 35)
        );
    }
}
