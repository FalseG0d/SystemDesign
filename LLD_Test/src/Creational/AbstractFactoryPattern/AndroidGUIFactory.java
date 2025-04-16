package Creational.AbstractFactoryPattern;

public class AndroidGUIFactory implements GUIFactory{
    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Text getText() {
        return new AndroidText();
    }
}
