package static1;

public class DataCountMain3 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        // 클래스명에 `.`을 찍어 사용한다
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
    }
}
