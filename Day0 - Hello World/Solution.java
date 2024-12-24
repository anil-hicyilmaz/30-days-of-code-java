import java.io.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reads the input string from the user
            String inputString = reader.readLine();
            
            System.out.println("Hello, World.");
            // Print the input string
            System.out.println(inputString);
        } catch (IOException e) {
            System.err.println("An error occurred while reading input from user.");
        }
    }
}