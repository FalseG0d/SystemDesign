package Interview.Main;

import Interview.Dao.ErrorMessage;
import Interview.Dao.Message;
import Interview.Dao.MessageFactory;
import Interview.Dao.TYPE;

public class Main {
    public static void main(String[] args) {
        MessageFactory messageFactory = new MessageFactory();

        Message newErrorMessage = messageFactory.getMessage(TYPE.ERROR);
        newErrorMessage.setMessage("First Error Message");
    }
}
