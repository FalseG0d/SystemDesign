package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Folder movieDirectory = new Folder("Movies");

        // Avengers Movies
        Folder avengersDirectory = new Folder("Avengers");
        avengersDirectory.add(new File("Captain America: The First Avenger"));
        avengersDirectory.add(new File("The Avengers"));
        avengersDirectory.add(new File("Avengers: Age of Ultron"));
        avengersDirectory.add(new File("Avengers: Infinity War"));
        avengersDirectory.add(new File("Avengers: Endgame"));
        avengersDirectory.add(new File("Iron Man"));
        avengersDirectory.add(new File("Iron Man 2"));
        avengersDirectory.add(new File("Iron Man 3"));
        avengersDirectory.add(new File("Thor"));
        avengersDirectory.add(new File("Thor: Ragnarok"));

        // DC Movies
        Folder dcDirectory = new Folder("DC");
        dcDirectory.add(new File("Man of Steel"));
        dcDirectory.add(new File("Batman v Superman: Dawn of Justice"));
        dcDirectory.add(new File("Wonder Woman"));
        dcDirectory.add(new File("Justice League"));
        dcDirectory.add(new File("Aquaman"));
        dcDirectory.add(new File("The Flash"));
        dcDirectory.add(new File("The Batman"));
        dcDirectory.add(new File("Shazam!"));

        // Add subdirectories to the Movies directory
        movieDirectory.add(avengersDirectory);
        movieDirectory.add(dcDirectory);

        movieDirectory.ls(0);
    }
}
