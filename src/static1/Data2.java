package static1;

public class Data2 {
    public String name;
    public int count;

    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
