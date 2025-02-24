package poly.ex4;

public class Dog extends AbstarctAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
