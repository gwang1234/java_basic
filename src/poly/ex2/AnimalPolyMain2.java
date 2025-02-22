package poly.ex2;


public class AnimalPolyMain2 {

    public static void main(String[] args) {
        // 다형성 활용으로 코드중복 문제 해결
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animals = {dog, cat, caw};

        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

}
