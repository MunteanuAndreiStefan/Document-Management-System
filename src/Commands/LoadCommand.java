package Commands;

import Controller.Command;
import Model.Catalog;

public class LoadCommand extends Command {
    public LoadCommand(Catalog catalog, String command)
    {
        super("");
    }
    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }
}
