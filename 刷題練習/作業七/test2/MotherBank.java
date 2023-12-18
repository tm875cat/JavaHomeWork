package 作業七.test2;

public class MotherBank {
    // (a) 選寫MotherBank類別，
    // (1) 類別中要有一int屬性(field): money用以紀錄戶頭還有多少錢(初始值200)
    // (2) 並有兩個方法(method): saveMoney(String name)存錢、takeMoney(String name)領錢
    // (3) 呼叫存錢時固定將money + 100，之後印出"name存錢，目前戶頭有money"。
    // (4) 呼叫領錢時固定將money - 120，領錢的當下若money少於120時歸0，之後印出"name領錢，目前戶頭剩money"。
    // (5) 要求: 同一支方法不可以同時被呼叫，即有學生在領錢時其他學生不可以同時領錢；存錢亦同。
    public MotherBank() {
        this.money = 200;
    }

    int money;

    public void saveMoney(String name) {
        money += 100;
    }

    public void takeMoney(String name) {
        money -= 120;
    }

}
