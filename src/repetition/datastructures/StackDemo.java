package repetition.datastructures;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack(4);

//        st.push(20);
//        st.push(40);
//        st.push(60);
//        st.push(80);
//
//        while(!st.isEmpty())
//            System.out.println(st.pop());

        System.out.println(reverseString("Java Enterprise"));
    }

    public static String reverseString(String str) {
        int maxSize = str.length();
        StringStack stringStack = new StringStack(maxSize);
        stringStack.push(str);
        str = stringStack.pop();
        return str;
    }
}