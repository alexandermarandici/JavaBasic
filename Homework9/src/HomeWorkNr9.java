public class HomeWorkNr9 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Polkan", "black", 5);
        IAnimals[] animal = {cat, dog};

        for (IAnimals animals : animal) {
            System.out.println(animals);
            System.out.println(animals.voice());
        }

    }
}
