package com.project.daangn.member.entity;

import com.project.daangn.post.entity.Address;
import com.project.daangn.post.entity.Location;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    private String email;

    private String password;

    private String nickname;
    @Embedded
    private Address address;
    @Embedded
    private Location location;

    public Member(){}

    @Builder
    public Member(String email, String password, String nickname){
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

}
