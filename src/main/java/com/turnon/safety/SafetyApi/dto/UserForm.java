package com.turnon.safety.SafetyApi.dto;

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

    // 데이터를 잘 받았늬 확인할 toString() 메서드 추가
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
