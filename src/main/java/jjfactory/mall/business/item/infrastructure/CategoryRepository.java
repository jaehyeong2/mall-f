package jjfactory.mall.business.item.infrastructure;

import jjfactory.mall.business.item.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}