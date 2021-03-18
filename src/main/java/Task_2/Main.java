package Task_2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\comp\\Desktop\\Module-9\\src\\main\\java\\Task_2\\file.txt")) {
            int c;
            String inputData = "";
            while ((c = reader.read()) > 0){
                inputData+=String.valueOf((char) c);
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String[] inputDataArr = inputData.split("\\n");
            String[] json = new String[inputDataArr.length-1];
            int j = 0;
            for(int i = 1; i < inputDataArr.length; i++){
                String[] inData = inputDataArr[i].split(" ");
                User user = new User(inData[0].strip(), inData[1].strip());
                json[j] = gson.toJson(user);
                j++;
            }
            System.out.println(Arrays.toString(json));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
