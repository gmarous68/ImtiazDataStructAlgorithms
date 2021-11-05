package Lambda;

public class App {

	public static void main(String[] args) {

		MyGenericInterface<String> strRev = (s) -> {
			String res = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				res += s.charAt(i);
			}
			return res;
		};
		System.out.println(strRev.work("Gerald"));

		System.out.println("-------------------");

		MyGenericInterface<Integer> fact = (n) -> {
			int res = 1;

			for (int i = 1; i <= n; i++)
				res *= i;
			return res;
		};
		System.out.println(fact.work(5));
	}
}

@FunctionalInterface
interface MyGenericInterface<T> {
	public T work(T t);
}
