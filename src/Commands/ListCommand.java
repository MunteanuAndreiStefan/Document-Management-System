package Commands;

import Controller.Command;
import Model.Catalog;

public class ListCommand extends Command {

    public ListCommand(Catalog catalog, String command) {
        super(command);
    }

    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }


}
