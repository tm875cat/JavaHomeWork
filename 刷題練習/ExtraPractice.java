import java.util.Scanner;

//更多请阅读：https://www.yiibai.com/java/java-arraylist-to-array.html

public class ExtraPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("輸入想要測試的方法");
            System.out.println("1:字串反轉演示");
            System.out.println("2:檢查輸入的字串中是否有匹配的括號");
            System.out.println("3:輸人兩個由小到大排序的數宇串列，將两個陣列合併後返回一個由小到大的串列");
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
                    // System.out.println(sort(array1, array2));
                    break;
                default:
                    System.out.println("輸入錯誤，請重新輸入");
            }
        }

    }

    public static String reverse(String input) {
        // (1)請編寫一個函數，將輸入的字串反轉過來。
        // 例：input=Hello world! . output =!dlrow olleH
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        return output;
    }

    public static boolean checkBrackets(String input) {
        // (2) 請編寫一個函數，檢查輸入的字串中是否有匹配的括號(）
        // 例：input=print('chinalife") •output=true
        // 例：input=(02)2345-6789) . output=false
        // 例：input=nlnlayaya ，output =false
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
    // public static LinkedList<Integer> sort(int[] array1, int[] array2) {

    // LinkedList<Integer> linkedList = new LinkedList<>();

    // for (int i = 0; i < array1.length; i++) {
    // linkedList.add(array1[i]);
    // }
    // for (int i = 0; i < array2.length; i++) {
    // linkedList.add(array2[i]);
    // }

    // int[] outputArray = new int[linkedList.size()];
    // for (int i = 0; i < linkedList.size(); i++) {
    // outputArray[i] = linkedList.get(i);
    // }
    // Arrays.sort(outputArray);
    // return outputArray;
    // }

    // (4)請編寫一個函數，檢查輸人的正整數是否為質數。
    // 例：input=13, output=true
    // 例：input=4, output=false

    // (5)請編寫一個函數，檢查輸人的句子中最後一個單字的長度。
    // 例：input=1'm fine, thank you. and you? , output =3

    // 12/8
    // (1)請編寫一個函數，輸人一個整數串列和一個整數，檢查整数串列中是否有任意兩個數宇相加後等於輸人的第二個整數例：input=[2,8,3, 71, 9•
    // output=true
    // 例：input=13, 1, 2,2, 61,2•output=false

    // (2)承(1)，只可使用一次迴圈，含lambda內建的遍歷操作

    // (3) 請編寫一個函數，輸入一正整數n，回傳Fibonacci數列的第n位數
    // 例：input=3,output=1
    // 例：input=5 • output=3

    // （4)承(3)，不可使用迥圈

}
