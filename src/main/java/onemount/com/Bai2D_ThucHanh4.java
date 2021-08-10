package onemount.com;

public class Bai2D_ThucHanh4 {
    public static int finalMultiplication(int num) {
        int finalMultiplication = 1;
        if(num == 1 ){
            return finalMultiplication;
        }else if(num <= 0){
            return 0;
        }else{
            for (int i = 2; i <= num ; i++) {
                finalMultiplication *= i;
            }
            return finalMultiplication;
        }
    }

}
