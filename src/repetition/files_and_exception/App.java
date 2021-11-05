package repetition.files_and_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\JavaCode\\ImtiazProject\\src\\repetition\\files_and_exception\\test.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

        MyFileUtils mfu = new MyFileUtils();
        try {
            System.out.println(mfu.sub10FromLargerNumber(9));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
