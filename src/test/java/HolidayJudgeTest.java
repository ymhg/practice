import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


interface IHolidayJudge {
    LocalDate getLocalDate();
}

public class HolidayJudgeTest {
    @Test
    public void today_is_holiday_0403() {
        HolidayJudge2 holidayJudge = new HolidayJudge2();
        holidayJudge.setNow(LocalDate.of(2024, 4, 3));
        assertEquals(true, holidayJudge.isHoliday());
    }

    @Test
    public void today_is_holiday_0402() {
        HolidayJudge2 holidayJudge = new HolidayJudge2();
        holidayJudge.setNow(LocalDate.of(2024, 4, 2));
        assertEquals(true, holidayJudge.isHoliday());
    }

    @Test
    public void today_is_not_holiday() {
        HolidayJudge2 holidayJudge = new HolidayJudge2();
        holidayJudge.setNow(LocalDate.of(2024, 1, 1));
        assertEquals(false, holidayJudge.isHoliday());
    }
}

class HolidayJudge2 extends HolidayJudge {
    private LocalDate now;

    @Override
    protected LocalDate getLocalDate() {
        return this.now;
    }

    public void setNow(LocalDate now) {
        this.now = now;
    }
}
