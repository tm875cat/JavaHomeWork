package 作業五;

import java.util.Scanner;

public class Test4 {
    // 4.
    // 請實作一個函數具有二個int參數，印出二數前數除後數結果，並具有捕捉異常的處理，前述內述要寫出二個版本，一版為函數內處理異常，另一版是將異常丟出函數外。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public static void division(int dividend, int divisor) {
        try {
            int output = dividend / divisor;
            System.out.println(output);
        } catch (Exception e) {
            System.out.println("錯誤");
        }
    }
}
