package 作業七.test1;

public class Wolf implements Runnable {

    // (b) 請撰寫Wolf類別，實作Runnable介面，用來描述大野狼視角的故事:
    // (1) 印出"大野狼: 對著第三隻小豬的房子吹氣"
    // (2) 印出"大野狼: 不停地吹氣"
    // (3) 印出"大野狼: 還是吹不倒"
    // (4) 印出"大野狼: 很生氣"
    // (5) 印出"大野狼: 決定要從煙囪爬進小豬家"
    @Override
    public void run() {
        String[] wolfArray = { "大野狼: 對著第三隻小豬的房子吹氣", "大野狼: 不停地吹氣", "大野狼: 還是吹不倒", "大野狼: 很生氣", "大野狼: 決定要從煙囪爬進小豬家" };
        for (int i = 0; i < wolfArray.length; i++) {
            try {
                System.out.println(wolfArray[i]);
            } catch (Exception e) {
                System.out.println("報錯");
            }
        }
    }
}
