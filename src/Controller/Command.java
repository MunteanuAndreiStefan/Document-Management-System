package Controller;

import java.util.Vector;

public abstract class Command {
    protected String command;
    protected int commandSize;

    public Command(String command){
        this.command=command;
        commandSize=getCommandSize(command);
    }

    abstract void executeCommand();


    public int getCommandSize(String command) {
        //TODO create a method that says how many arguments a function has.
        return command.length();
    }

}
