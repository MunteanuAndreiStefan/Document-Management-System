# Document-Management-System
Write an application that can manage a catalog of documents. An entry in this catalog might be an article, a book, a technical manual, etc. All items will have some common properties, such as a title, a path in the local file system, the author(s), a year, etc. Each document might have specific properties, such as a publisher for books, a journal or a conference for articles, etc.


    Create an object-oriented model of the problem. You should have at least the following classes: Book, Article. Consider using an interface or an abstract class in order to describe the documents in a catalog.
    Implement the following methods representing commands that will manage the content of the catalog:
        add: adds a new entry into the catalog;
        list: prints the content of the catalog on the screen;
        open: opens the document using the native operating system application (see the Desktop class);
        save: saves the catalog to an external file (either as a text or binary, using object serialization);
        load: loads the catalog from an external file. 

      Catalog catalog = new Catalog();
      catalog.add (new Book("The Art of Computer Programming", "d:\books\programming\tacp.ps", 1967, "Donald E. Knuth"));  
      catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "d:\articles\AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
      catalog.add (new Manual("Cookbook", "d:\stuff\cookbook.doc"));
      catalog.save("d:\catalog.dat");
      //...
      catalog = Catalog.load("d:\catalog.dat");
      catalog.list();

    The application will signal invalid data (year, path, etc.) using a custom exception.
    The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR. 


    Create a shell that allows reading commands from the keyboard, together with their arguments.
    Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.
    Implement the commands add, list, save, load, play (create the classes AddCommand, ListCommand, etc.).

      //at the keyboard
      add book "The Art of Computer Programming" "d:\books\programming\tacp.ps" 1967 "Donald E. Knuth"
      save d:\catalog.dat
      ...  

    Implement the command report html: create an HTML report representing the content of the catalog.
    The application will signal the commands that are not valid using a custom exception. 

