import java.time.LocalDate;

public class HolidayJudge {

    // no constructor
    // no field
    // no parameter
    //TODO

    // Test this legacy function : isHoliday()

    public boolean isHoliday() {
        LocalDate now = LocalDate.now();
        if (now.getMonthValue() == 12 && now.getDayOfMonth() == 25) {
            return true;
        }

        return false;
    }
}
