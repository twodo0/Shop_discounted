package jpabook.jpashop.discount;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {
    private final int discountFixAmount = 1000; // 1,000원 고정 할인

    @Override
    public int discount(Member member, int price) {
        return discountFixAmount;
    }
}