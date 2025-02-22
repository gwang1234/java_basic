package poly.ex2;


public class AnimalPolyMain3 {

    public static void main(String[] args) {
        // 다형성 활용으로 코드중복 문제 해결
        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
