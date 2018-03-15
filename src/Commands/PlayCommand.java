package Commands;

import Controller.Command;
import Model.Catalog;

import java.util.Vector;

public class PlayCommand extends Command {
    Vector<String> args;
    Catalog catalog;
    public PlayCommand(Catalog catalog, String command)
    {
        super("");
        this.catalog=catalog;
        this.args=getArgs(command);
    }

    @Override
    public void executeCommand()
    {
        if(catalog.contains(args.get(1)))
            catalog.search(args.get(1)).open();
    }
}
