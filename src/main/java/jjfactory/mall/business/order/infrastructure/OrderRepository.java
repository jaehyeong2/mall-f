package jjfactory.mall.business.order.infrastructure;

import jjfactory.mall.business.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}