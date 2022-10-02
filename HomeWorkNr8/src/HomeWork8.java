/**
 * Java Basic Home work 8
 *
 * @author Alexandru Marandici
 * @todo 28.09.2022
 * @date 01.09.2022
 */

class HomeWork8 {
public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2, 1);
        System.out.println(cat);
        System.out.println(cat.voice());
        System.out.println("try to play: " + cat.play());
        cat.feed();
        System.out.println("try to play: " + cat.play());
        System.out.println("try to play: " + cat.play());
        cat.feed();
        System.out.println("try to jump: " + cat.jump(1));
        cat.feed();
        System.out.println("try to jump: " + cat.jump(2));

    }
}
