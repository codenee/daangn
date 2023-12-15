package com.project.daangn.member.api;

import com.project.daangn.member.dto.MemberDto;
import com.project.daangn.member.entity.Member;
import com.project.daangn.member.service.MemberService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
public class MemberApiController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/api/members")
    public List<Member> index(){
        return memberService.index();
    }

    @PostMapping("/api/members")
    public ResponseEntity<Member> create(@RequestBody MemberDto dto){
        Member created = memberService.create(dto);
        return (created != null) ? ResponseEntity.status(HttpStatus.OK).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}
