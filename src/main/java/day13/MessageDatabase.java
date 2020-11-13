package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    static Message message;

    static List<Message>  messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
      messages.add(new Message(u1, u2, text));
    }

    public static  List<Message> getMessages() {
        return messages;
    }


    public static void showDialog(User u1, User u2){
        for (Message message: messages){
            if (message.getSender()==u1 && message.getReceiver()==u2){
                System.out.println(u1.getUsername()+":"+message.getText());
               // System.out.println(u1.getUsername()+":"+u2.getMessage());
               // System.out.println(u2.getUsername()+":"+u1.getMessage());
               // System.out.println(u2.getUsername()+":"+u1.message.getText());

                //System.out.println(u1.getUsername()+":"+u1.getMessage().text);
                //System.out.println(u2.getUsername()+":"+u2.getMessage().getText());
            }
        }
    }

}