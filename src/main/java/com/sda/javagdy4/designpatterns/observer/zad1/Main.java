package com.sda.javagdy4.designpatterns.observer.zad1;

public class Main {
    public static void main(String[] args) {
    Watcher watcher1 = new Watcher(5);
    Watcher watcher2 = new Watcher(4);
    Watcher watcher3 = new Watcher(1);
    Watcher watcher4 = new Watcher(6);
    Watcher watcher5 = new Watcher(9);

    NewStation newStation = new NewStation();
    newStation.addObserver(watcher1);
    newStation.addObserver(watcher2);
    newStation.addObserver(watcher3);
    newStation.addObserver(watcher4);
    newStation.addObserver(watcher5);

    newStation.setNewMessage(new Message("It's very important message",8));

    }
}
