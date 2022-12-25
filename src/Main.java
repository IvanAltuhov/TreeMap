import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Paul", "Van Dayk", 13));
        people.add(new Person("Вениамин", "Гудков", 35));
        people.add(new Person("Сергей", "Власов", 17));
        people.add(new Person("Вячеслав", "Глазков-Туполев", 54));


        Predicate<Person> min18 = person -> person.getAge() < 18;
        people.removeIf(min18);

        System.out.println(people);
    }
}