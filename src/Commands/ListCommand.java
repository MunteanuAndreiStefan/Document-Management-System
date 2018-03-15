package Commands;

import Controller.Command;
import Model.Catalog;

public class ListCommand extends Command {

    Catalog catalog;
    public ListCommand(Catalog catalog, String command) {
        super(command);
        this.catalog = catalog;
    }

    @Override
    public void executeCommand() {
        catalog.list();
    }


}
