package abstracts;

import interfaces.MusicPlayer;

public abstract class AbstractMusicPlayer implements MusicPlayer {
    protected String currentMusic;
    public abstract String getCurrentMusic();
}