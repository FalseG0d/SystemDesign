package Interview.Dao;

public class MessageFactory {
    Message msg;

    public Message getMessage(TYPE type) {
        switch (type) {
            case TYPE.ERROR: return new ErrorMessage("");
            default: return new ErrorMessage("");
        }
    }
}
