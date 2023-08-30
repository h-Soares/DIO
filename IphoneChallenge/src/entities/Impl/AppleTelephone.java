package entities.Impl;

import interfaces.Telephone;

public class AppleTelephone implements Telephone {
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " with Apple telephone...");
    }

    @Override
    public void answer() {
        System.out.println("Answering the phone with Apple telephone...");
    }

    @Override
    public void startVoiceMail(String number) {
        System.out.println("Starting voice mail with " + number + " with Apple telephone...");
    }
}