package human;

import java.util.Comparator;

public class SortedByAge implements Comparator<Human> {

    @Override
    public int compare(Human first, Human second) {
        int result = second.getYearBirth() - first.getYearBirth();
        if (result != 0) {
            return result;
        }
        result = second.getMonthBirth() - first.getMonthBirth();
        if (result != 0) {
            return result;
        }
        return second.getDayBirth() - first.getDayBirth();
    }
}
