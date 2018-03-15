package Model;

import java.io.*;
import java.util.*;

public class Catalog implements Serializable {


    private Map<String, Item> items;

    public Catalog() {
        this.items = new LinkedHashMap<String, Item>();
    }

    public void add(Item item) {
        this.items.put(item.getName(), item);
    }

    public void list() {
        System.out.println("Catalog collection: \n");
        System.out.println(Arrays.toString(items.values().toArray()));
    }

    public boolean contains(String toSearch) {
        if (items.containsKey(toSearch))
            return true;
        return false;
    }

    public Item search(String toSearch) {
        if (contains(toSearch))
            return items.get(toSearch);
        return null;
    }

    public void remove(String toSearch) {
        if (contains(toSearch))
            items.remove(toSearch);
    }

    public void clear(String toSearch) {
        items.clear();
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

    public static Catalog load(String path) {
        try {
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fin);
            return (Catalog) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

}
