import java.time.LocalDate;

public class HolidayJudge {

    // no constructor
    // no field
    // no parameter
    //TODO

    // Test this legacy function : isHoliday()

    public boolean isHoliday() {
        LocalDate now = getLocalDate();
        if (now.getMonthValue() == 4 && (now.getDayOfMonth() == 3 || now.getDayOfMonth() == 2)) {
            return true;
        }

        return false;
    }

    protected LocalDate getLocalDate() {
        LocalDate now = LocalDate.now();
        return now;
    }
}
