package repetition.files_and_exception;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("C:\\JavaCode\\ImtiazProject\\src\\repetition\\files_and_exception\\test.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);) {

            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}