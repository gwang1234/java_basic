package static1;

public class DataCountMain1 {

    public static void main(String[] args) {

        // 프로그램이 의도한대로 작동되지 않는 예시
        // 객체 생성될때마다 변수도 새로 만들어지기 때문에
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("B count=" + data3.count);
    }
}
