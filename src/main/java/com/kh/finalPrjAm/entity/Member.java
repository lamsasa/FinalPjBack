package com.kh.finalPrjAm.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // JPA에 Entity 클래스 명을 알려줌, DB 테이블로 만들어져야할 클래스
@Table(name="member") // 대소문자 구분 안 함, 생성될 DB 이름을 정해줌(자바의 표기법은 대소문자를 구분하며 카멜 표기법을 따름)
@Getter @Setter @ToString
public class Member {
    @Id // 해당 필드가 primary key 임을 지정
    @Column(name = "member_id") // DB 이름
    @GeneratedValue(strategy = GenerationType.AUTO) // 생성 전략
    private Long id;
    private String userId;
    private String name;
    private String password;
    @Column(unique = true)
    private String email;
    private LocalDateTime joinTime;
}
