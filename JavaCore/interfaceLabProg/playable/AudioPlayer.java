package interfaceLabProg.playable;

class AudioPlayer implements Playable {

    @Override
    public void play() {

        System.out.println();
        System.out.println("The Audio player starts playing audio.");
        System.out.println();
    }

    @Override
    public void stop() {

        System.out.println();
        System.out.println("The Audio Player stops playing audio.");
        System.out.println();
    }
}