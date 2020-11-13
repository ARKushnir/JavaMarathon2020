package day13;

import antlr.debug.MessageAdapter;

import java.util.ArrayList;
import java.util.List;

public class User {

    Message message;
    String username;
    List<User> subscriptions = new ArrayList<>();

    public Message getMessage() {
        return message;
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
           return  subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        return isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
                MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

}
