package com.turnon.safety.SafetyApi.controller;
import com.turnon.safety.SafetyApi.dto.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SafetyUser {

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(UserForm form) {
        System.out.println(form.toString());
        // 1. DTO를 엔티티로 변환
//        Article article = form.toEntity();
        // 2. 리파지터리로 엔티티를 DB에 저장

        return "";
    }
}
