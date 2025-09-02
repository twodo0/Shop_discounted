package jpabook.jpashop.discount;

import jpabook.jpashop.domain.Member;

/**
 * 할인 정책 인터페이스
 * @return 할인 금액(원)
 */
public interface DiscountPolicy {
    int discount(Member member, int price);
}