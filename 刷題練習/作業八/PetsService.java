package 作業八;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetsService {
    public static void main(String[] args) {
        PetsService p = new PetsService();

        p.readPetsFromFile("刷題練習\\作業八\\pets.txt");
    }

    private List<String> headerList;

    private void initHearderInfo(String header) {// 將輸入的字串切割成字串陣列並附值給headerList
        if (this.headerList == null) {// headerList為空時
            String[] strs = header.split(",");// 將輸入的字串 header 使用逗號分隔，生成一個字串陣列 strs
            this.headerList = new ArrayList<String>(Arrays.asList(strs));
        }
    }

    public String checkFirstLine(String fileName) {// 檢查第一行有甚麼
        // 放入文件路徑
        // FileReader類別:讀取檔案中的文字內容
        String firstLine = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // 讀取文件內容
            firstLine = reader.readLine();
            // while ((line = reader.readLine()) != null) {//用迴圈->全部印出
            // System.out.println(line);
            // }
        } catch (IOException e) {
            // 異常
            System.err.println("找不到檔案" + e.getMessage());
        }
        return firstLine;
    }

    public List<Object> readPetsFromFile(String fileName) {// 傳入字串並回傳物件List
        System.out.println(checkFirstLine("刷題練習\\作業八\\pets.txt"));
        return null;
    }

    // 1. check the first field to know which class we should use
    // 2. create an object from the first field
    // 3. set field value from data via set methods
    // 3.1 get header info
    // 3.2 generate method (function) name from header information
    // 3.3 get the associated field by header name, which should be the same as
    // field name, and identify the field type
    // 3.4 convert data into specific type. in this case, we have to deal with int
    // and double
    // 3.5 get declared method by method name
    // 3.6 invoke the associate method with converted value

    private Object parsePet(String data) {// 需將傳入的字串轉成物件回傳
        String[] str = data.split(",");

        return null;
    }

}
