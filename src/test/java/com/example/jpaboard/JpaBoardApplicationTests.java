package com.example.jpaboard;

import com.example.jpaboard.domain.member.Gender;
import com.example.jpaboard.domain.member.Member;
import com.example.jpaboard.domain.member.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class JpaBoardApplicationTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void saveMember() {
        Member saveParams = Member.builder()
                .loginId("min0320")
                .password("1234")
                .name("민지훈")
                .gender(Gender.M)
                .birthday(LocalDate.of(1997, 3, 20))
                .deleteYn(false)
                .build();

        Member member = memberRepository.save(saveParams);
        Assertions.assertEquals(member.getLoginId(), "min0320");
    }

}
