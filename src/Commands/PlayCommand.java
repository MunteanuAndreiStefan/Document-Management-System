package Commands;

import Controller.Command;
import Model.Catalog;

public class PlayCommand extends Command {
    String args[]=new String[10];
    public PlayCommand(Catalog catalog, String command)
    {
        super("");
    }
    @Override
    public void executeCommand() {
        Catalog.getInstance().list();
    }
}
