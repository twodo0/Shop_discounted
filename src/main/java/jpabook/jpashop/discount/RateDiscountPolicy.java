package jpabook.jpashop.discount;

import jpabook.jpashop.MainDiscountPolicy;
import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    private final int discountPercent = 10; // 10% 할인

    @Override
    public int discount(Member member, int price) {
        return price * discountPercent / 100;
    }
}