import java.util.function.Predicate;

public class PredicatePerson {
    public static void main(String[] args) {
        Predicate<Person> predicate1 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                if (person.getAge() < 18) {
                    return true;
                } else {
                    return false;
                }
            }
        };
    }
}
