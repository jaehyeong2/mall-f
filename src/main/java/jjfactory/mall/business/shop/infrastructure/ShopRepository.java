package jjfactory.mall.business.shop.infrastructure;

import jjfactory.mall.business.shop.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}