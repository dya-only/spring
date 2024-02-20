package codes.dya.spring.domain.member;

import codes.dya.spring.domain.member.repository.JpaMemberRepository;
import codes.dya.spring.domain.member.repository.MemberRepository;
import codes.dya.spring.domain.member.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    // MemoryRepository
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

    // JpaRepository
    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
