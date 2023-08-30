package entities.Impl;

import interfaces.Browser;

public class GoogleChrome implements Browser {
    @Override
    public void displayPage(String url) {
        System.out.println("Displaying the page " + url + " with Google Chrome...");
    }

    @Override
    public void addNewTab() {
        System.out.println("New page added with Google Chrome...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page with Google Chrome...");
    }
}