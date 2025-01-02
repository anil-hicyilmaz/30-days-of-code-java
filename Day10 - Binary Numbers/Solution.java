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

        bufferedReader.close();
        
        String binaryString = Integer.toBinaryString(n);
        
        System.out.println(countAndFindMaxConsecutiveOnes(binaryString));
    }
    
    //Function that splits binary string by 0, then counts the 1s
    private static int countAndFindMaxConsecutiveOnes(String binaryString) {
        int maxRepetition = 0;
        
        String[] splittedBinaryString = binaryString.split("0");
        
        for (int i = 0; i < splittedBinaryString.length ; i++) {
            if (splittedBinaryString[i].length() > maxRepetition) {
                maxRepetition = splittedBinaryString[i].length();
            }
        }
        
        return maxRepetition;
    }
}
