package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        // 힙영역 객체를 참조하는 곳이 사라졌다
        // GC가 참조가 모두 사라진 인스턴스를 찾아 메모리에서 제거
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        // 힙영역 객체 생성
        Data data = new Data(10);
        method2(data);
        System.out.println("method1 end");
    }

    static void method2(Data data) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data.getValue());
        System.out.println("method2 end");
    }
}
