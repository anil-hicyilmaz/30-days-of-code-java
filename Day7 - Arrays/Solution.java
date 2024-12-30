import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        List<Integer> reversedIntegerArray = reverseIntegerArray(arr);
        System.out.println(joinIntegers(" ", reversedIntegerArray));
    }
    
    private static List<Integer> reverseIntegerArray(List<Integer> integerArr) {
        List<Integer> reversedIntegerArray = new ArrayList<>();
        
        for (int i = 0; i < integerArr.size(); i++) {
            reversedIntegerArray.add(integerArr.get(integerArr.size() - i - 1));
        }
        
        return reversedIntegerArray;
    }
    
    private static String joinIntegers(String joinChar, List<Integer> integerArr) {
        String joinedIntegers = "";
        
        for (int i = 0; i < integerArr.size(); i++) {
            if(i == 0) {
                joinedIntegers += integerArr.get(i).toString();
            } else {
                joinedIntegers += joinChar + integerArr.get(i).toString();
            }
            
        }
        
        return joinedIntegers;
    }
}
