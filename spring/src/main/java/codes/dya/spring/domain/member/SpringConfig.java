package codes.dya.spring.domain.member;

import codes.dya.spring.domain.member.repository.MemberRepository;
import codes.dya.spring.domain.member.repository.MemoryMemberRepository;
import codes.dya.spring.domain.member.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
