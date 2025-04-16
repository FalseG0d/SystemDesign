package Creational.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory = new MacGUIFactory();

        Text txt = guiFactory.getText();
        Button btn = guiFactory.getButton();
    }
}
