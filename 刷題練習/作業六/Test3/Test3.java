package 作業六.Test3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test3 {
    // 3. 根據輸入的數字生成相應階層的聖誕樹並寫入christmas_tree.txt檔案
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tree = "";
        System.out.println("請輸入要幾層的聖誕樹");
        int lv = sc.nextInt();
        for (int i = 0; i < lv; i++) {
            for (int j = 0; j < lv - i - 1; j++) {
                tree += " ";
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                tree += "*";
            }
            tree += "\n";
        }
        System.out.println(tree);
        File treeFile = new File("作業六\\Test3\\christmas_tree.txt");
        PrintWriter writer = null;// 宣告writer為PrintWriter類別(宣告在try外面否則finally那裡抓不到writer)
        try {
            writer = new PrintWriter(treeFile);// writer放入treeFile
            writer.print(tree);
        } catch (Exception e) {
            System.out.println("檔案不存在");
        } finally {
            writer.close();// PrintWriter不關可能導致檔案未被正確寫入
        }

    }
}
