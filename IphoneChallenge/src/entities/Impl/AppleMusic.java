package entities.Impl;

import abstracts.AbstractMusicPlayer;

public class AppleMusic extends AbstractMusicPlayer {
    @Override
    public void selectMusic(String music) {
        this.currentMusic = music;
    }

    @Override
    public String getCurrentMusic() {
        return currentMusic;
    }

    @Override
    public void play() {
        System.out.println("You are now listening " + currentMusic + " with Apple Music...");
    }

    @Override
    public void pause() {
        System.out.println("Apple Music paused...");
    }
}