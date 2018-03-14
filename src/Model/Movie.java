package Model;

public class Movie extends Item  {

    private String description;
    private String director;


    public Movie(String name, String path,String description,String director, int releaseYear) {
        try {
            if (name.isEmpty() || path.isEmpty()) {
                throw new MyException("Can't be empty!\n");
            }
            else if (releaseYear < 1800) {
                throw new MyException("Released year can't be less then 1800.\n");
            }
            else {
                this.name = name;
                this.path = path;
                this.releaseYear = releaseYear;
                this.description=description;
                this.director = director;
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    @Override
    public String toString() {
        return  "Movie name: " + name + "\n Director:  " + director + "\n Description: " + description + "\n Release year: " +  releaseYear +  "\nPath: ["+ this.path +"]";
    }

}
