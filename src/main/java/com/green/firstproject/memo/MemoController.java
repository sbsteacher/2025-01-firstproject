package com.green.firstproject.memo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/memo")
public class MemoController {

    @GetMapping
    public String get() {
        return "memo";
    }
}
