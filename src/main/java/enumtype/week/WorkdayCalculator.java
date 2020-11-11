package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    private Day nextDay(Day day){
        if(day.ordinal() == Day.values().length - 1){
            return Day.values()[0];
        }
        else {
            return Day.values()[day.ordinal() + 1];
        }
    }

    public List<DayType> dayTypes(Day firstDay, int numberofDays){
        List<DayType> type = new ArrayList<>();
        Day d = firstDay;
        for( int i = 0; i < numberofDays; i++){
            type.add(d.getDayType());
            d = nextDay(d);
        }
        return type;
    }
}
