package Model;

import java.awt.*;
import java.io.File;
import java.io.Serializable;

public abstract class Item implements Serializable  {

    protected String name;
    protected String path;
    protected int releaseYear;

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public int getYear() {
        return this.releaseYear;
    }

    public void open() {
        try {
            File file = new File(this.path);

            if(!Desktop.isDesktopSupported()){
                System.out.println("Desktop is not supported");
            }
            else {
                Desktop desktop = Desktop.getDesktop();
                if(file.exists())
                    desktop.open(file);
                else {
                    System.out.println("File do not exist!");
                }
            }
        }catch(Exception e) {
            System.err.println(e);
        }

    }

}
