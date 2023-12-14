package 作業六.Test2;

// 2.請設計一個Playable介面，該介面包含一個play()方法。創建兩個實現了Playable介面的類別，分別是Instrument和MusicPlayer，它們都實作了play()方法。
// Instrument表示樂器，MusicPlayer表示音樂播放器。在主程式中，創建一個Playable陣列，其中包含不同實現的物件，如樂器和音樂播放器。
// 使用迴圈遍歷這個陣列，並呼叫每個物件的play()方法，模擬它們的播放行為。
public interface Playable {
    void play();
}

class Instrument implements Playable {
    public void play() {
        System.out.println("樂器播放");
    };
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("音樂播放器播放");
    };
}