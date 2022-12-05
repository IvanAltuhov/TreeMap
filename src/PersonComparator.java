import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int quantityWords1 = o1.getSurname().split("(?U)\\W").length;
        int quantityWords2 = o1.getSurname().split("(?U)\\W").length;
        if (quantityWords1 > quantityWords2 ){
            return 1;
        } else if (quantityWords1 == quantityWords2 ){
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        return -1;
    }
}
