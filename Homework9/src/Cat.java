public class Cat extends Animals implements IAnimals {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public String voice() {
        return "meow" ;
    }
}