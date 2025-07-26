package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Device radio = new Radio();
        Device television = new Television();

        RemoteControl radioRemote = new NomalRemote(radio);
        RemoteControl televisionRemote = new AdvancedRemote(television);
    }
}
