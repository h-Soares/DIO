package app;

import entities.Impl.AppleMusic;
import entities.Impl.AppleTelephone;
import entities.Impl.GoogleChrome;
import entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(new GoogleChrome(), new AppleMusic(), new AppleTelephone());

        try {
            iphone.selectMusic("Hino São Paulo Futebol Clube");
            iphone.playInMusicPlayer();
            iphone.pause();
            iphone.playInMusicPlayer();
            System.out.println();

            iphone.addNewTabInBrowser();
            iphone.displayPageInBrowser("https://spfc.net");
            iphone.refreshPageInBrowser();
            System.out.println();

            iphone.callInTelephone("14126541205");
            iphone.answerInTelephone();
            iphone.startVoiceMail("1802154025");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}