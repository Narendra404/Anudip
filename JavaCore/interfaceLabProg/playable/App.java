package interfaceLabProg.playable;

class App {
    public static void main(String[] args) {

        AudioPlayer a = new AudioPlayer();
        VideoPlayer v = new VideoPlayer();

        a.play();
        v.play();
        a.stop();
        v.stop();
    }
}