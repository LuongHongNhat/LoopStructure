package onemount.com;

public class Bai4_ThucHanh4 {
    public static int sumInterger(int num) {
        int sumInterger = 0;

        if(num > 50 || num < 0){
            return 0;
        }
        for (int i = 0; i < num; i++) {
            sumInterger += i;
        }
        return sumInterger;
    }
}
