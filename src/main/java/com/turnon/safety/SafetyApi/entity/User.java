package com.turnon.safety.SafetyApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // 테이블로 만들어줌
public class User {
    @Id // 기본키로 사용할 변수
    @GeneratedValue // 자동으로 값이 증가하도록 설정
    private Long id;

    @Column // 컬럼으로 사용할 변수
    private String name;
    private String company;
    private String role;
    private String team;
    private String position;
    private String phone;

    public User(String name, String company, String role, String team, String position, String phone) {
        this.name = name;
        this.company = company;
        this.role = role;
        this.team = team;
        this.position = position;
        this.phone = phone;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "name='" + name +  '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}

