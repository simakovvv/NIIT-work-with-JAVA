package hashCode;

public class Person {
    private String name;
    private  int age;
    private  String passport;

    public Person(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(!(obj instanceof Person)) return false;

        Person person = (Person) obj;

        return this.age == person.age && this.name.equals(person.name)
                && this.passport.equals(person.passport);

    }

    public int hashCode(){
        int result = 17;
        result = result * 31 +age;
        result = 31*result+name.hashCode();
        result = 31* result+passport.hashCode();

        return result;
    }
}
