import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //Since mentioned variable declarations are missing in the code, I declared them below
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {s
            String userInput = reader.readLine();
            int intVariable = Integer.parseInt(userInput);
            
            userInput = reader.readLine();
            double doubleVaribale = Double.parseDouble(userInput);
            
            userInput = reader.readLine();
            String stringVariable = userInput;
            
            System.out.println(i + intVariable);
            System.out.println(d + doubleVaribale);
            System.out.println(s + " " + stringVariable);
        } catch (IOException e) {
            System.err.println("An error occurred while reading input from user.");
        }
        
    }
}
