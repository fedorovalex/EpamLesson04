package human;

import java.util.Comparator;

public class SortedByName implements Comparator<Human> {

    @Override
    public int compare(Human first, Human second) {
        return first.getName().compareTo(second.getName());
    }
}
