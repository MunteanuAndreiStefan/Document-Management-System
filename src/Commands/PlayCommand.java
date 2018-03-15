package Commands;

import Controller.Command;
import Model.Catalog;

public class PlayCommand extends Command {
    String args[]=new String[10];
    Catalog catalog;
    public PlayCommand(Catalog catalog, String command)
    {
        super("");
        this.catalog = catalog;
    }
    @Override
    public void executeCommand() {
        catalog.list();
    }
}
