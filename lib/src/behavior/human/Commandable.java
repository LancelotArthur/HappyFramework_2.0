package behavior.human;

import application.Printable;

public interface Commandable extends Printable {
    public void execute();
    public void undo();
    public void redo();
}
