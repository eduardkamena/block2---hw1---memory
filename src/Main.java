import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 5:
        System.out.println("Task 5:");
        int value = 33;
        System.out.println("before value = " + value);
        changeValue(value);
        System.out.println("after value = " + value);

        // Task 6:
        System.out.println("Task 6:");
        Integer value1 = 33;
        System.out.println("before value1 = " + value1);
        changeValue(value1);
        System.out.println("after value1 = " + value1);

        // Task 7:
        System.out.println("Task 7:");
        Integer[] value2 = new Integer[]{3, 4};
        System.out.println("before value2 = " + Arrays.toString(value2));
        changeValue(value2);
        System.out.println("after value2 = " + Arrays.toString(value2));

        // Task 8:
        System.out.println("Task 8:");
        Integer[] value3 = new Integer[]{3, 4};
        System.out.println("before value3 = " + Arrays.toString(value3));
        changeValueA(value3);
        System.out.println("after value3 = " + Arrays.toString(value3));

        // Task 9:
        System.out.println("Task 9:");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("before person = " + person);
        changePerson(person);
        System.out.println("after person = " + person);

        // Task 10:
        System.out.println("Task 10:");
        Person person1 = new Person("Lyapis", "Trubetskoy");
        System.out.println("before person = " + person1);
        changePerson1(person1);
        System.out.println("after person = " + person1);
    }

    public static void changeValue(int value) {
        System.out.println("before changeValueInt = " + value);
        value = 22;
        System.out.println("after changeValueInt = " + value);
    }

    public static void changeValue(Integer value) {
        System.out.println("before changeValueInteger = " + value);
        value = 22;
        System.out.println("after changeValueInteger = " + value);
    }

    public static void changeValue(Integer[] value) {
        System.out.println("before changeValueArrayInteger = " + Arrays.toString(value));
        value = new Integer[]{1, 2};
        System.out.println("after changeValueArrayInteger = " + Arrays.toString(value));
    }

    public static void changeValueA(Integer[] value) {
        System.out.println("before changeValueArrayInteger = " + Arrays.toString(value));
        value[0] = 99;
        System.out.println("after changeValueArrayInteger = " + Arrays.toString(value));
    }

    public static void changePerson(Person person) {
        System.out.println("before changePerson = " + person);
        person = new Person("Ilya", "Lagutenko");
        System.out.println("after changePerson = " + person);
    }

    public static void changePerson1(Person person) {
        System.out.println("before changePerson1 = " + person);
        person.setName("Ilya");
        person.setSurname("Lagutenko");
        System.out.println("after changePerson1 = " + person);
    }

}
