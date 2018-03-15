package Model;

public class Book extends Item {

    private String author;
    private String description="";
    private String publisher;

    public Book(String name, String path,int releaseYear, String author, String description) {
        try {
            if (author.isEmpty()||name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.author=author;
                this.description=description;
                this.path = path;
                this.releaseYear = releaseYear;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    public Book(String name, String path,int releaseYear, String publisher ,String author, String description) {
        try {
            if (author.isEmpty()||name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.author=author;
                this.description=description;
                this.path = path;
                this.releaseYear = releaseYear;
                this.publisher = publisher;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    public Book(String name, String path,int releaseYear, String author) {
        try {
            if (author.isEmpty()||name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.author=author;
                this.path = path;
                this.releaseYear = releaseYear;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    public Book(String name, String path, String publisher,int releaseYear, String author) {
        try {
            if (author.isEmpty()||name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.author=author;
                this.path = path;
                this.releaseYear = releaseYear;
                this.publisher = publisher;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    @Override
    public String toString() {
        return  "Book name: " + name + "\n Author:  " + name + "\n Publisher:  " + publisher + "\n Description: " + description + "\n Release year: " +  releaseYear +  "\nPath: ["+ this.path +"]";
    }

}
