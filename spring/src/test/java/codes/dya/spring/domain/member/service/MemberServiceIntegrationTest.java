package codes.dya.spring.domain.member.service;

import codes.dya.spring.domain.member.Member;
import codes.dya.spring.domain.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class MemberServiceIntegrationTest {

    MemberService memberService;
    MemberRepository memberRepository;

    public MemberServiceIntegrationTest(MemberService memberService, MemberRepository memberRepository) {
        this.memberService = memberService;
        this.memberRepository = memberRepository;
    }

    @Test
    void join() {
        // given
        Member member = new Member();
        member.setName("spring");

        // when
        Long userId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(userId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }
}
