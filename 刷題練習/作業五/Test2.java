package 作業五;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    // 2. 請實作一個具有多重catch區塊的運作的程式？

    public static void main(String[] args) {
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
                sc.next();
            }

        }
        System.out.println("程式結束");
    }

    public static void ArrayChoose(int num) {
        String[] Store = { "商品一", "商品二", "商品三", "商品四", "商品五", "商品六", "商品七" };
        System.out.println(Store[num]);
    }
}
