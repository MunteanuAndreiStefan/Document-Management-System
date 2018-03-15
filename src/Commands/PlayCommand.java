package Commands;

import Controller.Command;
import Model.Catalog;

public class PlayCommand extends Command {
    String args[]=new String[10];
    public PlayCommand(String command)
    {
        super("");
    }
    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }
}
