import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Paul", "Van Dayk", 17));
        people.add(new Person("Вениамин", "Гудков", 35));
        people.add(new Person("Сергей", "Власов", 23));
        people.add(new Person("Вячеслав", "Глазков-Туполев", 54));

        Collections.sort(people, new PersonComparator().reversed());

        System.out.println(people);
    }
}
