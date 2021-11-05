package repetition.datastructures;

public class CounterDemo {
    public static void main(String[] args) {
        Counter count = new Counter("myCounter");

        System.out.println(count);
        count.increment();
        count.increment();
        count.increment();
        count.increment();
        System.out.println(count);
    }
}