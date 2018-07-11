package hashCode;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Gleb", 29,"354654");
        Person p2 = new Person("Gleb", 29,"354654");

        System.out.println(p2==p1);
        System.out.println(p2.equals(p1));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
