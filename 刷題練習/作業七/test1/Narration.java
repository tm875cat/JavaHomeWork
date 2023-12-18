package 作業七.test1;

public class Narration implements Runnable {
    // (c) 請撰寫Narration(旁白)類別，實作Runnable介面，用來描述故事結局:
    // (1) 印出"3分鐘 6分鐘 9分鐘 12分鐘 15分鐘"，要求: 於同一行並間隔1秒鐘再呈現一個分鐘
    // (2) 印出"旁白: 大野狼爬上煙囪"
    // (3) 印出"旁白: 大野狼從煙囪滑進房子"
    // (4) 印出"旁白: 就被小豬煮好的滾水燙死了"


    @Override
    public void run() {
        for (int i = 3; i < 18; i += 3) {
            try {
                System.out.print(i + "分鐘");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("報錯");
            }
        }
        System.out.println("\n旁白: 大野狼爬上煙囪");
        System.out.println("旁白: 大野狼從煙囪滑進房子");
        System.out.println("旁白: 就被小豬煮好的滾水燙死了");

    }
}
