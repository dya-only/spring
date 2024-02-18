package codes.dya.spring.domain.member.repository;

import codes.dya.spring.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {  // interface 사용 -> Overriding을 통해 같은 형식의 동작을 수행하는 다른 클래스를 여러개 만들 수 있음
    void save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
