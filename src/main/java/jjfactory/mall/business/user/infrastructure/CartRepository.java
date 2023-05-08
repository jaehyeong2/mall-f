package jjfactory.mall.business.user.infrastructure;

import jjfactory.mall.business.user.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}