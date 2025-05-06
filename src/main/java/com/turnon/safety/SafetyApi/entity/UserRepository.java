package com.turnon.safety.SafetyApi.entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 사용자 정의 쿼리도 여기에 작성
}
