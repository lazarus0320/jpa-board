package com.example.jpaboard.domain.member;

import com.example.jpaboard.domain.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_member")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "delete_yn")
    private Boolean deleteYn;

    @Builder
    public Member(Long id, String loginId, String password, String name, Gender gender, LocalDate birthday, Boolean deleteYn) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.deleteYn = deleteYn;
    }
}
