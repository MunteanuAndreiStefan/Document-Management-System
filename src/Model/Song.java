package Model;

public class Song extends Item { ;

    public Song(String name, String path, int releaseYear) {
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
            }
        }catch (MyException ex) {
            System.err.println(ex);
        }
    }

    @Override
    public String toString() {
        return  name + ", " + releaseYear+ "["+ this.path +"]";
    }

}
