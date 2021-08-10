package onemount.com;

import java.util.ArrayList;
import java.util.List;

public class Bai5_ThucHanh4 {
    public static String reverseInput(int num) {
        String reverseOutput = "";
        while(num != 0) {
            int digit = num % 10;
            String temp = String.valueOf(digit);
            reverseOutput += temp;
            num /= 10;
        }
        return reverseOutput;
    }
}
