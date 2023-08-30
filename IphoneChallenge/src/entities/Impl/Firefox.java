package entities.Impl;

import interfaces.Browser;

public class Firefox implements Browser {
    @Override
    public void displayPage(String url) {
        System.out.println("Displaying the page " + url + " with Firefox...");
    }

    @Override
    public void addNewTab() {
        System.out.println("New page added with Firefox...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page with Firefox...");
    }
}