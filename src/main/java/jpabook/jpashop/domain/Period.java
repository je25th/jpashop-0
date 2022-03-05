package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable//setter를 없애서 부작용 방지 -> 불변객체
public class Period {
    public Period() {
    }

    public Period(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public LocalDateTime getStartDate() {
        return startDate;
    }


    public LocalDateTime getEndDate() {
        return endDate;
    }

}
