package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Shell {

    private String commandLine = "";

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
            if (getCommand(commandLine).equals("exit")) {
                System.out.println("...Terminating Shell");
                System.exit(0);
            }
        }

    }
}
