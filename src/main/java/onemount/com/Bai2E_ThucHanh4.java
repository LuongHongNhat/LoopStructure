package onemount.com;

public class Bai2E_ThucHanh4 {
    public static int tongGiaiThua(int num) {
        int finalGiaiThua = 1;
        if(num==0 || num ==1){
            return finalGiaiThua;
        }else{
            for (int i = 2; i <= num ; i++) {
                finalGiaiThua *= i;
            }
            return finalGiaiThua;
        }
    }
}
