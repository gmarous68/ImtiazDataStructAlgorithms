package Misc;

public class LoopsPractice {

	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly more in demand "
				+ "category:makeup along with the category:furniture and...";

		printCategories(str);
	}

	public static void printCategories(String str) {
		int idx = 0;
		String result = "";

		while (true) {
			idx = str.indexOf(":", idx);
			if (idx != -1) {
				result = str.substring((idx + 1), str.indexOf(" ", idx));
				System.out.println(result);
				idx++;
			}
			else
				break;

		}
	}
}
