package poly.ex3;

public abstract class AbstarctAnimal {
    public abstract void sound();

    // 추상 메서드 x, 자식이 오버라이딩 할 필요 x
    public void move() {
        System.out.println("동물이 움직입니다");
    }
}
