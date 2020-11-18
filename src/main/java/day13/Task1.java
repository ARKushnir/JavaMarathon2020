package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Artem");
        User user2 = new User("Andrey");
        User user3 = new User("Alexander");

        //MessageDatabase.addNewMessage(user1, user2, "Hi");
        //MessageDatabase.addNewMessage(user1, user2, "Hi Man");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "Hi Man");

        user2.sendMessage(user1, "Hi Artem");
        user2.sendMessage(user1, "Hi Artem Hi are you ?");
        user2.sendMessage(user1, "Hi Artem we are going to ");

       user3.sendMessage(user1, "Hi Artem from Alexander msg 1" );
        user3.sendMessage(user1, "Hi Artem from Alexander msg 2" );
        user3.sendMessage(user1, "Hi Artem from Alexander msg 3" );

        user1.sendMessage(user3, "Hi user3 from user1 msg 1" );
        user1.sendMessage(user3, "Hi user3 from user1 msg 2" );
        user1.sendMessage(user3, "Hi user3 from user1 msg 3" );

        user3.sendMessage(user1, "Hi Artem from Alexander msg 4" );

        MessageDatabase.showDialog(user3, user1);
    }
}
