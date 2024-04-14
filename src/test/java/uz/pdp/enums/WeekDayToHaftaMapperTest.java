package uz.pdp.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static uz.pdp.enums.WeekDayToHaftaMapper.WEEK_DAY_TO_HAFTA_MAPPER;

class WeekDayToHaftaMapperTest {

    @Test
    void from() {
        WeekDays from = WEEK_DAY_TO_HAFTA_MAPPER.from(Hafta.SESHANBA);
        System.out.println("from = " + from);
    }

    @Test
    void to() {
        Hafta hafta = WEEK_DAY_TO_HAFTA_MAPPER.to(WeekDays.MONDAY);
        System.out.println("hafta = " + hafta);
    }
}