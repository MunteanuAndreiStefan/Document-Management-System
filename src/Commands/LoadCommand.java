package Commands;

import Controller.Command;
import Model.Catalog;

public class LoadCommand extends Command {
    String args[]=new String[10];
    public LoadCommand(String command)
    {
        super("");
    }
    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }
}
