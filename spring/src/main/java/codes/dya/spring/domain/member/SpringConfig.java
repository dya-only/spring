package codes.dya.spring.domain.member;

import codes.dya.spring.domain.member.repository.MemberRepository;
import codes.dya.spring.domain.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    private final EntityManager em;
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
//        this.em = em;
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository() {
// //        return new MemoryMemberRepository();  // MemoryRepository
// //        return new JpaMemberRepository(em);  // JpaRepository
//    }
}
