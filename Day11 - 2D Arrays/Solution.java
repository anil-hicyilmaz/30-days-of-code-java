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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        //My implementation starts here
        List<List<Integer>> hourglassPositions = extractHourglassPositions(arr);
        
        System.out.println(findMaxHourglassValue(hourglassPositions, arr));
    }
    
    private static List<List<Integer>> extractHourglassPositions(List<List<Integer>> matrixArray) {
        List<List<Integer>> hourglassPositions = new ArrayList<>();
        int[] positions = new int[2];
        
        for (int y = 0; y < matrixArray.size(); y++) {
            for (int x = 0; x < matrixArray.size(); x++) {
                positions[0] = x;
                positions[1] = y;
                
                if (isPositionIncrementable(positions)) {
                    hourglassPositions.add(Arrays.asList(x,y));
                }
            }
        }
    
        
        return hourglassPositions;
    }
    
    
    //Since the constraint for matrix to be 6x6, function checks if the incremented value is greater than 5.
    private static boolean isPositionIncrementable(int[] position) {
        if(position[0] + 2 >  5 || position[1] + 2 > 5) {
            return false;
        }
                
        return true;
    }
    
    private static int findMaxHourglassValue(List<List<Integer>> hourglassPositions, List<List<Integer>> matrixArray) {
        int maxValue = -1000;
        
        for (int i = 0; i < hourglassPositions.size(); i++) {
            int tempHourglassValue = 0;
            int hourglassPositionX = hourglassPositions.get(i).get(0);
            int hourglassPositionY = hourglassPositions.get(i).get(1);
            
            tempHourglassValue += matrixArray.get(hourglassPositionY).get(hourglassPositionX);
            tempHourglassValue += matrixArray.get(hourglassPositionY).get(hourglassPositionX + 1);
            tempHourglassValue += matrixArray.get(hourglassPositionY).get(hourglassPositionX + 2);
            tempHourglassValue += matrixArray.get(hourglassPositionY + 1).get(hourglassPositionX + 1);
            tempHourglassValue += matrixArray.get(hourglassPositionY + 2).get(hourglassPositionX);
            tempHourglassValue += matrixArray.get(hourglassPositionY + 2).get(hourglassPositionX + 1);
            tempHourglassValue += matrixArray.get(hourglassPositionY + 2).get(hourglassPositionX + 2);
            
            if(tempHourglassValue > maxValue) {
                maxValue = tempHourglassValue;
            }
        }
        
        return maxValue;
    }
}
