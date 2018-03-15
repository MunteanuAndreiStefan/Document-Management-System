package Commands;

import Controller.Command;
import Model.Catalog;

import java.util.Vector;

public class SaveCommand extends Command {
    Catalog catalog;
    Vector<String> args;
    public SaveCommand(Catalog catalog, String command)
    {
        super("save");
        this.catalog=catalog;
        this.args=getArgs(command);

    }
    @Override
    public void executeCommand() {
        this.catalog.save(args.get(1));
    }
}
