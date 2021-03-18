package Task_3;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\comp\\Desktop\\Module-9\\src\\main\\java\\Task_3\\words.txt")){
            int c;
            String inputData = "";
            while ((c = reader.read()) > 0){
                inputData += String.valueOf((char) c);
            }
            HashMap<String, Integer> hashMap = new HashMap<>();
            String[] inputDataArr = inputData.split("\\n");
            ArrayList<String> words = new ArrayList<>();
            for (String str:inputDataArr) {
                String[] temp = str.split(" ");
                for (String str1:temp) {
                    int size = words.size();
                    words.add(size, str1);
                }
            }
            /*for (int i = 0; i < words.size(); i++) {
                hashMap.put(words.get(i), 0);
            }
            System.out.println(hashMap);*/
            //System.out.println(words);
            System.out.println(Arrays.toString(inputDataArr));
            System.out.println(inputData);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
