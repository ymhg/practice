import java.time.LocalDate;

public class HolidayJudge {

    // no constructor
    // no field
    // no parameter
    //TODO

    // Test this legacy function : isHoliday()

    public boolean isHoliday() {
        if (LocalDate.now().equals(LocalDate.parse("2024-12-25"))) {
            return true;
        }

        return false;
    }
}
