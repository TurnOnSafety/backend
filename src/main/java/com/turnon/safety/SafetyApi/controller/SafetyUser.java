package com.turnon.safety.SafetyApi.controller;
import com.turnon.safety.SafetyApi.dto.UserForm;
import com.turnon.safety.SafetyApi.entity.NewUser;
import com.turnon.safety.SafetyApi.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SafetyUser {

    @Autowired // 의존성 주입
    private UserRepository userRepository;

    @GetMapping("/user/new")
    public String newUserForm() {
        return "users/new";
    }

    @PostMapping("/user/create")
    public String createUser(UserForm form) {
        System.out.println(form.toString());
        // 1. DTO를 엔티티로 변환
        NewUser newUser = form.toEntity();
        // 2. 리파지터리로 엔티티를 DB에 저장
        NewUser saved = userRepository.save(newUser);

        return "";
    }
}
