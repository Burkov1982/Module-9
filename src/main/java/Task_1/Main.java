package Task_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\comp\\Desktop\\Module 9\\src\\Task_1\\file.txt")) {
            int c;
            String data = "";

            while((c =reader.read())!=-1){
                data += String.valueOf((char) c);
            }
            String[] inputData = data.split("\\n");

           for(int i = 0; i < inputData.length; i++){
               String string = inputData[i].strip();
               String regex1 = "\\d{3}[-.]?\\d{3}[-.]?\\d{4}";
               String regex2 = "[(.]\\d{3}[).]\\s\\d{3}[-.]\\d{4}";
                if (string.matches(regex1)) {
                    System.out.println(string);
                }
                if (string.matches(regex2)) {
                    System.out.println(string);
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

