package poly.ex4;

public class Cat extends AbstarctAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
