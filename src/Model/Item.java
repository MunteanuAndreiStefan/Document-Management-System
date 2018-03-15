package Model;

import java.awt.*;
import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

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

    public String getMetaData(){
        StringBuilder val = new StringBuilder("");
        try {
            BasicFileAttributes attr = Files.readAttributes(Paths.get(this.path), BasicFileAttributes.class);
            val.append("creationTime: " + attr.creationTime() + "\n");
            val.append("lastAccessTime: " + attr.lastAccessTime() + "\n");
            val.append("lastModifiedTime: " + attr.lastModifiedTime() + "\n");

            val.append("isDirectory: " + attr.isDirectory() + "\n");
            val.append("isOther: " + attr.isOther() + "\n");
            val.append("isRegularFile: " + attr.isRegularFile() + "\n");
            val.append("isSymbolicLink: " + attr.isSymbolicLink() + "\n");
            val.append("size: " + attr.size() + "\n");

        }catch(Exception e) {
            System.err.println(e);
        }
        return val.toString();
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
