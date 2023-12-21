package 作業八;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetsService {
    public static void main(String[] args) {
        String filePath = "刷題練習\\作業八\\pets.txt";
        // System.out.println(checkFirstLine(filePath));
        parsePet(checkLine(filePath ,2));
        // 非靜態方法須有實體才能用
        PetsService pets=new PetsService();
        String headerInfo=checkLine(filePath,1);//取得header資訊
  

    }

    private List<String> headerList;

    private  void initHearderInfo(String header) {// 將輸入的字串切割成字串陣列並附值給headerList
        if (this.headerList == null) {// headerList為空時
            String[] strs = header.split(",");// 將輸入的字串 header 使用逗號分隔，生成一個字串陣列 strs
            this.headerList = new ArrayList<String>(Arrays.asList(strs));
        }
    }
 

    private static Object parsePet(String data) {// 將傳入的字串轉成物件回傳
        String[] str = data.split(",");
        System.out.println("str陣列測試" + Arrays.toString(str));
        Class<?> firstLineClassName = null;// 取得class名稱
        Object firstLineObject = null;

        try {
            firstLineClassName = Class.forName("作業八." + str[0]);// 不知為何抓不到Cat類別，先手動把作業八.路徑打上去
            firstLineObject = firstLineClassName.newInstance();
            // 找方法
            Method setNameMethod = firstLineClassName.getMethod("setName", String.class);
            Method setAgeMethod = firstLineClassName.getMethod("setAge", int.class);
            Method setOwnerMethod = firstLineClassName.getMethod("setOwner", String.class);
            // 找方法
            // 用這些方法設定屬性值
            // invoke(傳入obj(靜態方法可傳null,傳入呼叫方法時所需的參數))->返回Class方法內的retun值
            setNameMethod.invoke(firstLineObject, str[1]);
            setAgeMethod.invoke(firstLineObject, Integer.parseInt(str[2]));
            setOwnerMethod.invoke(firstLineObject, str[3]);
        } catch (InstantiationException e) {
            System.out.println("實體化異常");
        } catch (IllegalAccessException e) {
            System.out.println("非法訪問異常");
        } catch (ClassNotFoundException e) {
            System.out.println("class沒找到");
        } catch (NoSuchMethodException e) {
            System.out.println("方法沒找到");
        } catch (InvocationTargetException e) {
            System.out.println("其他異常");
        }

        System.out.println(firstLineObject + "檔案");
        // 指定參數內容

        return firstLineObject;
    }

    public static String checkLine(String fileName ,int n) {// 返回第n欄
        // 放入文件路徑
        // FileReader類別:讀取檔案中的文字內容
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // 讀取文件內容
            for (int i = 0; i < n; i++) {
                line = reader.readLine();
            }
            // System.out.println(line);測試用
        } catch (IOException e) {
            // 異常
            System.err.println("找不到檔案" + e.getMessage());
        }
        return line;
    }

    public List<Object> readPetsFromFile(String fileName) {// 傳入字串並回傳物件List
  
        return null;
    }

    // 1. check the first field to know which class we should use V
    // 2. create an object from the first field V
    // 3. set field value from data via set methods
    // 3.1 get header info
    // 3.2 generate method (function) name from header information
    // 3.3 get the associated field by header name, which should be the same as
    // field name, and identify the field type
    // 3.4 convert data into specific type. in this case, we have to deal with int
    // and double
    // 3.5 get declared method by method name
    // 3.6 invoke the associate method with converted value

}
