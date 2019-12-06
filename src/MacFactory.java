
public class MacFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
