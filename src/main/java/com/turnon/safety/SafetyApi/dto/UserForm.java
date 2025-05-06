package com.turnon.safety.SafetyApi.dto;

import com.turnon.safety.SafetyApi.entity.NewUser;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserForm {
    private String name;
    private String company;
    private String role;
    private String team;
    private String position;
    private String phone;


    public UserForm(String name, String company, String role, String team, String position, String phone) {
        this.name = name;
        this.company = company;
        this.role = role;
        this.team = team;
        this.position = position;
        this.phone = phone;


    }

    // 데이터를 잘 받았는지 확인할 toString() 메서드 추가
    @Override
    public String toString() {
        return "NewUser{" +
                "name='" + name +  '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // DTO → Entity 변환 메서드
    public NewUser toEntity() {
        return new NewUser(null, name, company, role, team, position, phone);
    }

}
