package onemount.com;

public class Bai1B_ThucHanh4 {
    public static String kiemTraSoChinhPhuong(int num) {
        String yes = "số chính phương";
        String no = "không phải là số chính phương";
        if (num > 0) {
            int a = (int) Math.sqrt(num);
            if ((a * a) == num)
                return yes;
            else
               return no;
        }
        return no;
    }
}
