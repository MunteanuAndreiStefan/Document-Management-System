package Model;

import java.util.Arrays;

public class Article extends Item {

    private String[] authors;
    private String description="";

    public Article(String name, String path,int releaseYear, String description, String... authors) {
        try {
            if (authors[0].isEmpty() ||name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.authors=authors;
                this.description=description;
                this.path = path;
                this.releaseYear = releaseYear;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    public Article(String name, String path,int releaseYear, String... authors) {
        try {
            if (authors[0].isEmpty() ||name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.authors=authors;
                this.path = path;
                this.releaseYear = releaseYear;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    @Override
    public String toString() {
        return  "Movie name: " + name + "\n Authors:  " + Arrays.toString(authors)  + "\n Description: " + description + "\n Release year: " +  releaseYear +  "\nPath: ["+ this.path +"]";
    }

}
