//package com.kh.finalPrjAm.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "orders")
//@Getter @Setter @ToString
//public class OrderItem {
//    @Id
//    @GeneratedValue
//    @Column(name = "order_id")
//    private Long id;
//    @ManyToOne
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    // 주문 상품 엔티티와 일대다 매핑
//    // 왜래키
//    @OneToMany(mappedBy = "order")
//    private List<OrderItem> orderItemList = new ArrayList<>();
//
//    private LocalDateTime orderDate;
//
//}
