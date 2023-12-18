package 作業七.test1;

// 劇本要求: 大野狼必須先決定要從煙囪爬進小豬家，小豬才看到大野狼爬煙囪開始煮水，再輪到旁白收尾。參考結果如下:
// 大野狼: 對著第三隻小豬的房子吹氣
// 大野狼: 不停地吹氣
// 大野狼: 還是吹不倒
// 大野狼: 很生氣
// 大野狼: 決定要從煙囪爬進小豬家
// 小豬: 看到大野狼爬煙囪
// 小豬: 就在壁爐燒了一鍋水
// 2分鐘 4分鐘 6分鐘 8分鐘 10分鐘 
// 小豬: 一鍋煮沸的水煮好了
// 3分鐘 6分鐘 9分鐘 12分鐘 15分鐘 
// 旁白: 大野狼爬上煙囪
// 旁白: 大野狼從煙囪滑進房子
// 旁白: 就被小豬煮好的滾水燙死了
public class Story {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Pig pig = new Pig();
        Narration narration = new Narration();
        wolf.run();
        pig.run();
        narration.run();
    }
}
