package jjfactory.mall.business.notice.infrastructure;

import jjfactory.mall.business.notice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}