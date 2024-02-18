package codes.dya.spring.domain.member.controller;

import codes.dya.spring.domain.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    @Autowired
    public MemberController(MemberService memberService) {
    }
}
