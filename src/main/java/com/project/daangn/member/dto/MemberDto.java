package com.project.daangn.member.dto;

import com.project.daangn.member.entity.Member;
import com.project.daangn.post.entity.Address;
import com.project.daangn.post.entity.Location;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private Address address;
    private Location location;

    public MemberDto(Long id, String email, String password, String nickname, Address address, Location location){
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.address = address;
        this.location = location;
    }

    public Member toEntity() {
        return new Member(email, password, nickname);
    }
}
