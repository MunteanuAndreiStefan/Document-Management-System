package Commands;

import Controller.Command;
import Model.Catalog;

public class SaveCommand extends Command {
    public SaveCommand(Catalog catalog, String command)
    {
        super("a");

    }
    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }
}
