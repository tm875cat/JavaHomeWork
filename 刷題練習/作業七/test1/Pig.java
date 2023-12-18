package 作業七.test1;

public class Pig implements Runnable {
    // 1.請利用多執行緒(multi-thread)來完成第三隻小豬和大野狼的故事。可利用join()、sleep()、例外處理來完成程式流程。
    // (a) 請撰寫Pig類別(Class)，實作(implements)Runnable介面(interface)，用來描述小豬視角的故事:
    // (1) 印出"小豬: 看到大野狼爬煙囪"
    // (2) 印出"小豬: 就在壁爐燒了一鍋水"
    // (3) 印出"2分鐘 4分鐘 6分鐘 8分鐘 10分鐘"，要求: 於同一行並間隔1秒鐘再呈現一個分鐘
    // (4) 印出"小豬: 一鍋煮沸的水煮好了"
 

    @Override
    public void run() {
        System.out.println("小豬: 看到大野狼爬煙囪");
        System.out.println("小豬: 就在壁爐燒了一鍋水");
        try {
            for (int i = 2; i < 12; i += 2) {
                System.out.print(i + "分鐘");
                Thread.sleep(1000);
            }
            System.out.println("");
            System.out.println("小豬:一鍋煮沸的水煮好了");
        } catch (Exception e) {
            System.out.println("報錯");
        }
    }
}
