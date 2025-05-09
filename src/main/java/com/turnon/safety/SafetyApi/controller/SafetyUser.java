package com.turnon.safety.SafetyApi.controller;
import com.turnon.safety.SafetyApi.dto.UserForm;
import com.turnon.safety.SafetyApi.entity.NewUser;
import com.turnon.safety.SafetyApi.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/safety/workers")
public class SafetyUser {

    @Autowired // 의존성 주입
    private UserRepository userRepository;

    // 사용자 생성 JSON 으로 받는다.
    @PostMapping("/create")
    public ResponseEntity<NewUser> createUser(@RequestBody UserForm form) {

        // 1. DTO를 엔티티로 변환
        NewUser newUser = form.toEntity();
        // 2. 리파지터리로 엔티티를 DB에 저장
        NewUser saved = userRepository.save(newUser);

        return ResponseEntity.ok(saved);
    }
}



