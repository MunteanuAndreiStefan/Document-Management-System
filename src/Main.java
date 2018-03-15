import Model.*;
import Controller.*;



public class Main {


    public static void main(String[] args) {


        Catalog catalog = Catalog.getInstance();
        Song sg = new Song("song1", "C:\\git\\Document-Management-System\\src\\song.mp3", 2016);

        //sg.open();

        Book bk = new Book("book", "book.pdf", 1850, "Stefan", "bla bla bla\n"  );

        catalog.add(sg);

        catalog.add(bk);

        catalog.list();

        sg.open();

        System.out.print(sg.getMetaData());

        catalog.save("catalog1.dat");

        Shell sh = new Shell();


    }
}
