package com.kh.finalPrjAm.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Getter @Setter @ToString
public class CartItem {
    @Id
    @GeneratedValue
    @Column(name = "cart_item_id")
    private Long id;

    @ManyToOne  // 하나의 장바구니에는 여러개의 상품을 담을 수 있으므로 다대일 매핑
    @JoinColumn(name="cart_id")
    private Cart cart;

    @ManyToOne // 하나의 상품은 여러 장바구니의 상품으로 포함될 수 있으므로 다대일 관계 매핑
    // 장바구니에 담을 삼품 정보를 알아야 하므로 삼품 엔티티를 매핑
    @JoinColumn(name = "item_id")
    private Item item;

    private int count; // 같은 상품을 몇개 담을지 지정
}
