package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    SimpleDateFormat formatter= new SimpleDateFormat("EEE, MMMM d, yyyy 'MSK' HH:mm:ss z");

    User sender;
    User receiver;
    String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date(System.currentTimeMillis());
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
     return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", date=" + date +
                '}';
    }
}
