package com.turnon.safety.SafetyApi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Table(name = "safety_users")
@Entity // 테이블로 만들어줌
@Getter
@NoArgsConstructor      // 기본 생성자 자동 생성
public class NewUser {
    @Id // 기본키로 사용할 변수
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column // 컬럼으로 사용할 변수
    private String name;
    @Column
    private String company;
    @Column
    private String role;
    @Column
    private String team;
    @Column
    private String position;
    @Column
    private String phone;


    public NewUser(Long user_id, String name, String company, String role, String team, String position, String phone) {
        this.user_id = user_id;
        this.name = name;
        this.company = company;
        this.role = role;
        this.team = team;
        this.position = position;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "from entity , NewUser{" +
                "name='" + name +  '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}

