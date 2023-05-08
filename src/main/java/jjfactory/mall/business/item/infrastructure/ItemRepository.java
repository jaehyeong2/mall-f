package jjfactory.mall.business.item.infrastructure;

import jjfactory.mall.business.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}