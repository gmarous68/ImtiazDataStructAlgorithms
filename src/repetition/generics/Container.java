package repetition.generics;

public class Container<T1, T2, T3> {
    T1 item1;
    T2 item2;
    T3 item3;

    public Container(T1 item1, T2 item2, T3 item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public T1 getItem1() {
        return item1;
    }

    public void setItem1(T1 item1) {
        this.item1 = item1;
    }

    public T2 getItem2() {
        return item2;
    }

    public void setItem2(T2 item2) {
        this.item2 = item2;
    }

    public void printItems() {
        System.out.println("Item1: " + item1 + ", item2: " + item2 + ", item3: " + item3);
    }
}