package creational.builder;

public class BuilderPatternTest {
    
    public static void main(String[] args) {
        Person ava = new Person.Builder(1, "Ava", "Mehdipour").build();

        System.out.println(ava.getFirstName());
        System.out.println(ava.getLastName());

    }

}