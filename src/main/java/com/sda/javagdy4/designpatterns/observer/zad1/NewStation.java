package com.sda.javagdy4.designpatterns.observer.zad1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;

@Data
@NoArgsConstructor
public class NewStation extends Observable {
private Message newMessage;

    public void setNewMessage(Message newMessage) {
        this.newMessage = newMessage;

        setChanged();
        notifyObservers(newMessage);
    }
}
