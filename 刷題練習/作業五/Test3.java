package 作業五;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 3. 請實作一個需要有finally區塊的範例？並說明為什麼。
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入商品編號(0~6):");
            try {
                int num = sc.nextInt();
                ArrayChoose(num);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("輸入錯誤，請輸入0~6");
            } catch (InputMismatchException e) {
                System.out.println("輸入錯誤，請輸入數字");

            } finally {
                sc.next();// 必須執行這行清除輸入緩衝區的非數字字元
            }
        }
        System.out.println("程式結束");
    }
    public static void ArrayChoose(int num) {
        String[] Store = { "商品一", "商品二", "商品三", "商品四", "商品五", "商品六", "商品七" };
        System.out.println(Store[num]);
    }
}
