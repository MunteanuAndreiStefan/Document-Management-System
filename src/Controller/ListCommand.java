package Controller;

import Model.Catalog;

public class ListCommand extends  Command {

    public ListCommand(String command) {
        super(command);
    }

    @Override
    void executeCommand() {
        Catalog.getInstance().list();
    }


}
