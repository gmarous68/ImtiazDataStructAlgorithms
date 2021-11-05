package repetition.programmingpuzzles.puzzles15;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		int max = 0;

		for(int i=0; i<str.length(); i++) {
			int count = 0;
			for(int k=i; k<str.length(); k++) {
				if(str.charAt(i) == str.charAt(k))
					count++;
				else
					break;
			}
			if(count > max)
				max = count;
		}
		return max;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

