package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue++; // 인스턴스 변수 접근, compile error
        // instanceMethod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    // 인스턴스 생성시에만 호출 가능
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    // 공용메서드로 어디서든 호출 가능
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
