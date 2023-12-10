import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExtraPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("輸入想要測試的方法");
            System.out.println("1:字串反轉演示");
            System.out.println("2:檢查輸入的字串中是否有匹配的括號");
            System.out.println("3:輸人兩個由小到大排序的數宇串列，將两個陣列合併後返回一個由小到大的串列");
            System.out.println("4:檢查輸人的正整數是否為質數");
            System.out.println("5:檢查輸人的句子中最後一個單字的長度");
            System.out.println("6:檢查整数串列中是否有任意兩個數宇相加後是否等於輸人的第二個整數");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("字串反轉演示，請輸入一個字串");
                    String reverseInput = sc.next();
                    System.out.println(reverse(reverseInput));
                    break;
                case 2:
                    System.out.println("檢查輸入的字串中是否有匹配的括號，請輸入一個字串");
                    String checkBracketsInput = sc.next();
                    System.out.println(checkBrackets(checkBracketsInput));
                    break;
                case 3:
                    System.out.println("將2個陣列合併後返回一個由小到大的串列");
                    int[] array1 = { 1, 7, 10, 55 };
                    int[] array2 = { 3, 8, 15, 44, 66 };
                    System.out.println("排序後" + sort(array1, array2));
                    break;
                case 4:
                    System.out.println("檢查輸人的正整數是否為質數，請輸入正整數");
                    int primeInput = sc.nextInt();
                    System.out.println(primeCheck(primeInput));
                    break;
                case 5:
                    sc.nextLine();// 用來消耗換行符號
                    System.out.println("檢查輸人的句子中最後一個單字的長度");
                    String finalWordInput = sc.nextLine();
                    System.out.println(finalWord(finalWordInput));
                    break;
                case 6:
                    System.out.println("檢查整数串列中是否有任意兩個數宇相加後是否等於輸人的第二個整數");
                    
                    break;
                default:
                    System.out.println("輸入錯誤，請重新輸入");
            }
        }

    }

    // (1)請編寫一個函數，將輸入的字串反轉過來。
    // 例：input=Hello world! . output =!dlrow olleH
    public static String reverse(String input) {

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        return output;
    }

    // (2) 請編寫一個函數，檢查輸入的字串中是否有匹配的括號(）
    // 例：input=print('chinalife") •output=true
    // 例：input=(02)2345-6789) . output=false
    // 例：input=nlnlayaya ，output =false
    public static boolean checkBrackets(String input) {

        boolean result = false;
        String[] inputArray = input.split("");
        int leftCheck = 0;
        int rightCheck = 0;
        int leftNum = 0;
        int rightNum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("(")) {
                leftNum++;
            }
            if (inputArray[i].equals(")")) {
                rightNum++;
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("(")) {
                leftCheck++;
                for (int j = i + 1; j < inputArray.length; j++) {
                    if (inputArray[j].equals(")")) {
                        inputArray[j] = ",";
                        rightCheck++;
                        break;
                    }
                }
            }
        }
        if (leftCheck == rightCheck && leftNum == rightNum && leftNum != 0) {
            result = true;
        }
        return result;
    }

    // (3)請編寫一個函數，輸人兩個由小到大排序的數宇串列，將两個陣列合併後返回一個由小到大的串列。
    // input=[2,6,8],[1,3,4,5,10,12],output=[1,2,3,4,5,6,8,10,12]
    public static List<Integer> sort(int[] array1, int[] array2) {
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            inputList.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            inputList.add(array2[i]);
        }
        System.out.println("排序前" + inputList);
        Collections.sort(inputList);
        return inputList;
    }

    // (4)請編寫一個函數，檢查輸人的正整數是否為質數。
    // 例：input=13, output=true
    // 例：input=4, output=false
    public static boolean primeCheck(int input) {
        if (input <= 1) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    // (5)請編寫一個函數，檢查輸人的句子中最後一個單字的長度。
    // 例：input=I'm fine, thank you. and you? , output =3
    public static int finalWord(String input) {
        String[] inputArray = input.split("");
        String regex = ".*[a-zA-Z]+.*";
        int num = 0;
        boolean isEn = false;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i].matches(regex)) {
                num++;
                isEn = true;
            }
            if (!inputArray[i].matches(regex) && isEn) {
                break;
            }
        }
        return num;
    }

    // 12/8
    // (1)請編寫一個函數，輸人一個整數串列和一個整數，檢查整数串列中是否有任意兩個數宇相加後是否等於輸人的第二個整數例：input=[2,8,3,7] ,9
    // output=true
    // 例：input=[3, 1, 2,2, 6],2，output=false
    public static boolean sumIsSecond(int[] input) {
        for (int i = 0; i < input.length; i++) {
            
            for (int j = 0; j < input.length; j++) {

            }
        }
        return false;
    }

    // (2)承(1)，只可使用一次迴圈，含lambda內建的遍歷操作

    // (3) 請編寫一個函數，輸入一正整數n，回傳Fibonacci數列的第n位數
    // 例：input=3,output=1
    // 例：input=5 • output=3

    // （4)承(3)，不可使用迥圈

}
