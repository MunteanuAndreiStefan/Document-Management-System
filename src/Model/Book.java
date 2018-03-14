package Model;

public class Book extends Item {

    private String author;
    private String description="";

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

    @Override
    public String toString() {
        return  "Movie name: " + name + "\n Author:  " + author + "\n Description: " + description + "\n Release year: " +  releaseYear +  "\nPath: ["+ this.path +"]";
    }

}
