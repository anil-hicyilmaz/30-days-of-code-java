import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int n = Integer.parseInt(reader.readLine());
                        
            for (int i = 0; i < n; i++) {
                String phoneEntry = reader.readLine();

                String name = phoneEntry.split(" ")[0];
                int number = Integer.parseInt(phoneEntry.split(" ")[1]);
                
                phoneBook.put(name, number);
            }
            
            while(reader.ready()) {
                String nameToLookFor = reader.readLine();
                
                System.out.println(getPhoneRecordByName(nameToLookFor, phoneBook));
            }
        } catch (IOException e) {
            
        }
    }
    
    private static String getPhoneRecordByName(String name, Map<String, Integer> phoneBook) {
        String phoneRecord = "";
        
        if (phoneBook.containsKey(name)) {
            phoneRecord = name + "=" + phoneBook.get(name);
        } else {
            phoneRecord = "Not found";
        }
        
        return phoneRecord;
    }
}
