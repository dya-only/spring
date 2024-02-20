package codes.dya.spring.domain.member.repository;

import codes.dya.spring.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {  // interface 사용 -> Overriding을 통해 구현체 생성
    void save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
