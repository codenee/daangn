package com.project.daangn.member.service;

import com.project.daangn.member.dto.MemberDto;
import com.project.daangn.member.entity.Member;
import com.project.daangn.member.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    public Member create(MemberDto dto){
        Member member = dto.toEntity();
        if(member.getId() != null){
            return null;
        }
        return memberRepository.save(member);
    }

    public List<Member> index(){
        return memberRepository.findAll();
    }

}
