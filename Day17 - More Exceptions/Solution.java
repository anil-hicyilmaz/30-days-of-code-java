import java.util.*;
import java.io.*;

//Write your code here
class NOrPIsNegativeException extends Exception {
    NOrPIsNegativeException () {
        super("n and p should be non-negative");
    }
}
class NIsNegativeException extends NOrPIsNegativeException {}
class PIsNegativeException extends NOrPIsNegativeException  {}

class Calculator {
    public int power(int n, int p) throws NIsNegativeException, PIsNegativeException {
        int result = n;
        
        if (n < 0) {
            throw new NIsNegativeException();
        } else if (p < 0) {
            throw new PIsNegativeException();
        } else if (n == 0) {
            return 0;
        } else if (p == 0) {
            return 1;
        }
        
        for (int i = 0; i < p - 1; i++) {
            result *= n;
        }
        
        return result;
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
