package jjfactory.mall.business.coupon.infrastructure;

import jjfactory.mall.business.coupon.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}