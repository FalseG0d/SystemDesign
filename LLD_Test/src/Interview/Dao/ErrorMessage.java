package Interview.Dao;

public class ErrorMessage implements Message{
    String message;

    public ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println(message);
    }

    @Override
    public void setMessage(String msg) {
        this.message = message;
    }
}
