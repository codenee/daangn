package com.project.daangn.member.repository;

import com.project.daangn.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query(value = "SELECT * FROM member WHERE email = :email", nativeQuery = true)
    public boolean existsByEmail(String email);

    @Override
    public ArrayList<Member> findAll();

}
