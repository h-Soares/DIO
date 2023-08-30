package entities;

import abstracts.AbstractMusicPlayer;
import interfaces.Browser;
import interfaces.Telephone;

public class Iphone {
    private static final String URL_REGEX = "(http|ftp|https):\\/\\/([\\w_-]+(?:(?:\\.[\\w_-]+)+))([\\w.,@?^=%&:\\/~+#-]*[\\w@?^=%&\\/~+#-])";
    private static final String URL_NUMBER = "^$|^\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})$|^([0-9]{11})$";

    Browser browser;
    AbstractMusicPlayer abstractMusicPlayer;
    Telephone telephone;

    public Iphone(Browser browser, AbstractMusicPlayer abstractMusicPlayer, Telephone telephone) {
        this.browser = browser;
        this.abstractMusicPlayer = abstractMusicPlayer;
        this.telephone = telephone;
    }

    public void selectMusic(String music) {
        abstractMusicPlayer.selectMusic(music);
    }
    
    public void playInMusicPlayer() {
        validateCurrentMusic();
        abstractMusicPlayer.play();
    }

    public void pause() {
        validateCurrentMusic();
        abstractMusicPlayer.pause();
    }

    public void addNewTabInBrowser() {
        browser.addNewTab();
    }

    public void displayPageInBrowser(String url) {
        validateUrl(url);
        browser.displayPage(url);
    }

    public void refreshPageInBrowser() {
        browser.refreshPage();
    }

    public void callInTelephone(String number) {
        validateNumber(number);
        telephone.call(number);
    }

    public void answerInTelephone() {
        telephone.answer();
    }

    public void startVoiceMail(String number) {
        validateNumber(number);
        telephone.startVoiceMail(number);
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void setAbstractMusicPlayer(AbstractMusicPlayer abstractMusicPlayer) {
        this.abstractMusicPlayer = abstractMusicPlayer;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    private void validateCurrentMusic() {
        if(abstractMusicPlayer.getCurrentMusic() == null)
            throw new IllegalStateException("No music selected");
    }

    private static void validateUrl(String url) {
        if(!url.matches(URL_REGEX))
            throw new IllegalArgumentException("Invalid url");
    }

    private static void validateNumber(String number) {
        if(!number.matches(URL_NUMBER))
            throw new IllegalArgumentException("Invalid number");
    }
}