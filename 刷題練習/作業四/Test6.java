package 作業四;

public class Test6 {
    public static void main(String[] args) {
        findMin();
    }

    public static void findMin() {
        // 6.設二維陣列 arr 的内容為{（18，21，30），（40，34，61」，（41，15，181}。試撰寫一程式，找出 arr
        // 中最小値的列索引和行索引。
        int[][] arr = { { 18, 21, 30 }, { 40, 15, 181 }, { 41, 15, 181 } };
        int min = arr[0][0];
        int line = 0;
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    line = i;
                    row = j;
                }
            }
        }
        System.out.println("最小值為:" + arr[line][row] + "在" + (row + 1) + "行" + (line + 1) + "列");
    }
}
