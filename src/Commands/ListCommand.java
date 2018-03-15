package Commands;

import Controller.Command;
import Model.Catalog;

public class ListCommand extends Command {

    Catalog catalog;
    public ListCommand(String command) {
        super(command);
    }

    @Override
    public void executeCommand(Catalog cat) {
        catalog=cat;
    }


}
