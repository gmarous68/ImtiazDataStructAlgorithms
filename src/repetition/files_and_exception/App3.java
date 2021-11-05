package repetition.files_and_exception;

class MyClass implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing..");
    }
}

public class App3 {
    public static void main(String[] args) {
        try(MyClass mc = new MyClass()) {
            System.out.println("Inside MyClass now..");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}