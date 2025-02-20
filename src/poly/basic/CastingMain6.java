package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1= new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // child 인스턴스인 경우 childMathod() 실행, 자바 16부터 실행 됨
        // 다운캐스팅 생략 가능
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        }
    }

}
