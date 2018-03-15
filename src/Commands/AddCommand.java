package Commands;

import Controller.Command;
import Model.Catalog;

public class AddCommand extends Command {
    public AddCommand(Catalog catalog, String command) {
        super("a");
    }

    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }

}
