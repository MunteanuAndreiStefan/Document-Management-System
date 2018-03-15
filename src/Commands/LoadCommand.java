package Commands;

import Controller.Command;
import Model.Catalog;

import java.util.Vector;

public class LoadCommand extends Command {
    Vector<String> args;
    Catalog catalog;
    public LoadCommand(Catalog catalog, String command)
    {
        super("");
        this.catalog=catalog;
        this.args=getArgs(command);
    }

    @Override
    public void executeCommand()
    {
        catalog.save(args.get(1));
    }
}
