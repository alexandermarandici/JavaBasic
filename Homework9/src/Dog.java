public class Dog extends Animals implements IAnimals{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public String voice() {
        return "gaf-gaf" ;
    }
}
