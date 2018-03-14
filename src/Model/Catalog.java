package Model;

import java.io.*;
import java.util.*;

public class Catalog implements Serializable  {

    private static Catalog instance = null;

    public static Catalog getInstance(){
        if(instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    private Map<String,Item> items;

    protected Catalog() {
        this.items = new LinkedHashMap<String,Item>();
    }

    public void add(Item item) {
        this.items.put(item.getName(),item);
    }

    public void list() {
        System.out.println("Catalog collection: \n");
        System.out.println(Arrays.toString(items.values().toArray()));
    }

    public boolean contains(String toSearch) {
        if(items.containsKey(toSearch))
            return true;
        return false;
    }

    public Item search(String toSearch){
        if(contains(toSearch))
            return items.get(toSearch);
        return null;
    }

    public void save(String path) {
        try {
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(this);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load(String path) {
        try {
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fin);
            Catalog cat = (Catalog) ois.readObject();
            this.items = cat.items;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
