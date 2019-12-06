
public class WinFactory implements IGUIFactory{
    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WinCheckbox();
    }
}
