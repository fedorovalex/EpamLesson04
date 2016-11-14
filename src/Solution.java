import com.sun.org.apache.xpath.internal.SourceTree;
import human.Human;
import human.SortedByAge;
import human.SortedByName;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Human people[] = new Human[5];
        people[0] = new Human("Александр", 30, 4, 1994, 120062);
        people[1] = new Human("Константин", 11, 6, 2005, 150481);
        people[2] = new Human("Александр", 11, 1, 1994, 120080);
        people[3] = new Human("Константин", 11, 6, 2005, 156092);
        people[4] = new Human("Станислав", 5, 10, 1992, 115042);

        System.out.println("До сортировки:");
        print(people);

        Arrays.sort(people);
        System.out.println("\nСортировка по умолчанию(возраст, номер документа):");
        print(people);

        Arrays.sort(people, new SortedByAge());
        System.out.println("\nСортировка по возрастанию возраста:");
        print(people);

        Arrays.sort(people, new SortedByName());
        System.out.println("\nСортировка в алфавитном порядке по именам:");
        print(people);
    }

    private static void print(Human[] people) {
        for (Human human: people) {
            System.out.println(writeToString(human));
        }
    }

    private static String writeToString(Human human) {
        return human.getName() + ", " + human.getDayBirth() + "." + human.getMonthBirth()
                + "." + human.getYearBirth() + ", " + human.getPassportNumber() + ";";
    }
}
