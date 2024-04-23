package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
//        AbstractAnimal abstractAnimal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("테스트 종료");
    }
}
