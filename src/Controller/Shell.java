package Controller;

import Commands.*;
import Model.Catalog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Shell {

    private String commandLine = "";
    private Catalog catalog=Catalog.getInstance();

    public String getCommand(String commandLine) {
        Vector<String> splitCommands = new Vector<String>();
        for (String retval : commandLine.split(" ", 2)) {
            splitCommands.addElement(retval);
        }
        return splitCommands.elementAt(0);
    }

    public String readCommand() throws IOException {
        String command;
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter command:");
        command = reader.readLine();
        return command;
    }

    public Shell() {

        while (true) {
            // read the command
            System.out.print("Shell> ");
            try {
                this.commandLine = readCommand();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // if just a return, loop
            if (commandLine.equals(""))
                continue;

            //Example
            else if (getCommand(commandLine).equals("exit")) {
                System.out.println("...Terminating Shell");
                System.exit(0);
            }
            else if (getCommand(commandLine).equals("add")) {
                AddCommand command= new AddCommand(catalog, this.commandLine);
                command.executeCommand();
            }
            else if (getCommand(commandLine).equals("list")) {
                ListCommand command= new ListCommand(catalog, this.commandLine);
                command.executeCommand();
            }
            else if (getCommand(commandLine).equals("save")) {
                ListCommand command= new ListCommand(catalog, this.commandLine);
                command.executeCommand();
            }
            else if (getCommand(commandLine).equals("play")) {
                PlayCommand command= new PlayCommand(catalog, this.commandLine);
                command.executeCommand();
            }
            else if (getCommand(commandLine).equals("load")) {
                LoadCommand command= new LoadCommand(catalog, this.commandLine);
                command.executeCommand();
            }

        }

    }
}
