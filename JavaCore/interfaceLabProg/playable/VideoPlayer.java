package interfaceLabProg.playable;

class VideoPlayer implements Playable {

    @Override
    public void play() {

        System.out.println();
        System.out.println("The Video Player starts playing video.");
        System.out.println();
    }

    @Override
    public void stop() {

        System.out.println();
        System.out.println("The Video Player stops playing video.");
        System.out.println();
    }
}