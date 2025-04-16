package Creational.AbstractFactoryPattern;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Text getText() {
        return new MacText();
    }
}
