package 作業七.test2;

public class Student extends Thread {
    // (b) 撰寫Student類別，繼承Thread，
    // (1) 類別中要有一String屬性: name用以記錄學生姓名、有一MotherBank屬性: motherBank用以操作戶頭
    // (2) 有一個方法: deal()交易，呼叫時請隨機執行motherBank的存錢或領錢，共10次。每次執行完畢後休息1秒再執行下一次。
    // (3) 並有一建構子(constructor)用以在創建Student物件時給name、motherBank賦值。
    // (4) Override run()，於run()中呼叫deal()。
    public Student(String studentName) {
        this.name = studentName;
    }
    private String name;
    MotherBank bank = new MotherBank();

    @Override
    public void run() {
        deal();
    }

    public void deal() {
        for (int i = 0; i < 10; i++) {
            if ((Math.random() * 10) % 2 == 0) {
                bank.saveMoney(name);
            } else {
                bank.takeMoney(name);
            }
        }
    }
}
