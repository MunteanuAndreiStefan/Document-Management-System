package Commands;

import Controller.Command;
import Model.*;


import java.util.Vector;

public class AddCommand extends Command {

    public Vector<String> args= new Vector<String>();
    Catalog catalog;
    public AddCommand(Catalog catalog, String command) {
        super("add");
        this.catalog = catalog;
        this.catalog=catalog;
        this.args=getArgs(command);


        System.out.println(command);


    }

    @Override
    public void executeCommand() {
        Item item;
        item=new Item() {
            @Override
            public String getName() {
                return super.getName();
            }
        };

        if(args.get(1).equals("book"))
        {
            item=new Book(args.get(2),args.get(3),Integer.parseInt(args.get(4)),args.get(5),args.get(6));
        }
        else if(args.get(1).equals("song"))
        {
            item=new Song(args.get(2),args.get(3),Integer.parseInt(args.get(4)));
        }
        else if(args.get(1).equals("movie"))
        {
            item=new Movie(args.get(2),args.get(3),args.get(4),args.get(5),Integer.parseInt(args.get(6)));
        }
        else if(args.get(1).equals("article"))
        {
            // item=new Article(args.get(2),args.get(3),Integer.parseInt(args.get(4)),args.get(5),args.get(6));
        }

        this.catalog.add(item);
    }

}
