package ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try {
			File f = new File("myFile.txt");
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine())
				System.out.println(sc.nextLine());

			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		
		MyFileUtils mfu = new MyFileUtils();
		
		try {
			System.out.println(mfu.subtract10FromlargerNumber(19));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
