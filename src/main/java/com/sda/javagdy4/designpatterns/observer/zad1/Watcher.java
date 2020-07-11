package com.sda.javagdy4.designpatterns.observer.zad1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;
@Data
@NoArgsConstructor
public class Watcher implements Observer {

    private int panicLevel;

    public Watcher(int panicLevel) {
        this.panicLevel = panicLevel;
    }

    @Override
    public void update(Observable o, Object newMessage) {
        Message text = (Message) newMessage;
        System.out.println("My panicLvl is "+ panicLevel +  " I get message " +text);
    }
}
