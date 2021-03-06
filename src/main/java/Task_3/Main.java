package Task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\comp\\Desktop\\Module-9\\src\\main\\resources\\Task_3\\words.txt")){
            BufferedReader bufferedReader = new BufferedReader(reader);
            ArrayList<String> strings = new ArrayList<>();
            String temp = bufferedReader.readLine();
            int counter = 0;

            while (temp!=null){
                String[] tempArrOfWords = temp.split(" ");
                temp = bufferedReader.readLine();

                for (String str:tempArrOfWords){
                    strings.add(counter, str);
                    counter++;
                }
            }

            HashMap<String, Integer> hashMap = new HashMap<>();
            HashMap<String, String> hashMap1 = new HashMap<>();

            for (String string:strings) {

                hashMap.put(string, 0);
                hashMap1.put(string, string);
            }

            for (String str:strings) {

                if (hashMap.containsKey(str)){
                    hashMap.replace(str, hashMap.get(str), hashMap.get(str)+1);
                }
            }

            strings.clear();
            strings.addAll(hashMap1.values());
            int[]  arrOfRepetition = new int[hashMap.size()];
            int count = 0;
            int max = 0;

            for (String str:strings) {

                arrOfRepetition[count] = hashMap.get(str);
                count++;
            }

            Arrays.sort(arrOfRepetition);

            for (int i = arrOfRepetition.length-1; i >= 0; i--) {

                for (String str:strings){

                    if (arrOfRepetition[i] == hashMap.get(str)){
                        System.out.println(str + "  " + arrOfRepetition[i]);
                    }
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
