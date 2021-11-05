package repetition.lambda;

public class App {
    public static void main(String[] args) {
//        Walkable x = () -> System.out.println("Hello there.. ");
//        x.walk();
//
//        Calculate add = (a, b) -> a + b;
//        System.out.println("Summa = " + add.compute (5,4));
//
//        Calculate divide = (a, b) -> {
//                    if(b == 0)
//                        return 0;
//                    return a / b;};
//        System.out.println("Division = " + divide.compute (3,2));

        MyGenericInterface<String> strOp = (s) -> {
                        String result = "";
                        for(int i = s.length()-1; i >= 0; i--)
                            result += s.charAt(i);
                        return result;};
        System.out.println(strOp.work("Java"));

        MyGenericInterface<Integer> factorial = (a) -> {
                        int result = 1;
                        for(int i=1; i<=a; i++)
                            result = i * result;
                        return result;};
        System.out.println(factorial.work(5));
    }
}

@FunctionalInterface
interface Calculate {
    public int compute(int a, int b);
}

@FunctionalInterface
interface Factorial {
    public int fact(int a);
}

@FunctionalInterface
interface MyGenericInterface<T> {
    public T work(T x);
}