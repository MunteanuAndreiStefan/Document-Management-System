package Commands;

import Controller.Command;
import Model.Catalog;

public class PlayCommand extends Command {
    public PlayCommand(Catalog catalog, String command)
    {
        super("");
    }
    @Override
    public void executeCommand(Catalog cat) {
        cat.list();
    }
}
