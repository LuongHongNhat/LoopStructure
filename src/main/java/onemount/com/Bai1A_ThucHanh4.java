package onemount.com;

public class Bai1A_ThucHanh4 {
    public static String checkDoiXung(int num) {
        String revertToString = String.valueOf(num);
        String reverseOutput = "";
        String pass ="Đây là chuỗi đối xứng";
        String fail ="Đây là chuỗi không đối xứng";
        while(num != 0) {
            int digit = num % 10;
            String temp = String.valueOf(digit);
            reverseOutput += temp;
            num /= 10;
        }
        if(reverseOutput.equals(revertToString)){
            return pass;
        }else{
            return fail;
        }

    }
    //cach này e ngâm cứu chưa xong:
    // e đi theo hướng lấy vị trí giữa ra sau đó cho so sánh 2 giá trị [vị trí giữa + 1] và [vị trí giữa -1]
    //nhưng e đang kẹt ở chỗ chạy 2 vòng for song song :(
//    public static String checkDoiXung(int num) {
//        String fail = "Số không đối xứng";
//        String pass = "Số đối xứng";
//        String str = String.valueOf(num);
//        int position = str.length()/2;
//
//        for (int i = position -1 ; i == 0; i--) {
//            for (int j = position+1 ; j = str.length(); j++) {
//                char temp1 = str.charAt(i);
//                char temp2 = str.charAt(j);
//                if (temp1==temp2) {
//                    continue;
//                }
//                return fail;
//            }
//        }
//        return pass;
//    }


}
