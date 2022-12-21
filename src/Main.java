import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Paul", "Van Dayk", 13));
        people.add(new Person("Вениамин", "Гудков", 35));
        people.add(new Person("Сергей", "Власов", 17));
        people.add(new Person("Вячеслав", "Глазков-Туполев", 54));




        Comparator<Person> comparator;
        /*
        comparator = (Person o1, Person o2) -> {
                int quantityWords1 = o1.getSurname().split("(?U)\\W").length;
                int quantityWords2 = o1.getSurname().split("(?U)\\W").length;
                if (quantityWords1 > quantityWords2 ){
                    return 1;
                } else if (quantityWords1 == quantityWords2 ){
                    return Integer.compare(o2.getAge(), o1.getAge());
                }

                return -1;
            };
    */
        comparator = (Person o1, Person o2) -> Integer.compare(o2.getAge(), o1.getAge());


        Collections.sort(people, comparator);

        System.out.println(people);
    }
}
