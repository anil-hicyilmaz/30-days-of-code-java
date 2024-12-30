import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int numOfTestCases = Integer.parseInt(reader.readLine());
            
            for (int i = 0; i < numOfTestCases; i++) {
                String inputString = reader.readLine();
            
                System.out.println(divideString(inputString));
            }
            
        } catch (IOException e) {
            System.err.println("An error occured while reading input from user.");
        }
        
    }
    
    private static String divideString(String stringToDivide) {
        String evenIndexedChars = "";
        String oddIndexedChars = "";
        
        for (int i = 0; i < stringToDivide.length(); i++) {
            if (i % 2 == 0) {
                evenIndexedChars = evenIndexedChars + Character.toString(stringToDivide.charAt(i));
            } else {
                oddIndexedChars = oddIndexedChars + Character.toString(stringToDivide.charAt(i));
            }
        }
        
        return evenIndexedChars + " " + oddIndexedChars;
    }
}