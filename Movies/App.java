public class App {
    public static void main(String[] args) {
        
        Movies m1 = new Movies ("20th Century Girl", "Melodrama", "PG-13", "Korean", 
        2022, "South Korea", "Bang Woo - Ri", "English", "Beginning");
        
        System.out.println(" ");
        
        Movies m2 = new Movies ("Howl's Moving Castle", "Fantasy", "U", "Japanese", 
        2004, "Japan", "Hayao Miyazaki", "English", "Sekai no Yakusoku");

        // System.out.println("First Movie ");
        // System.out.println(m1.title);
        // System.out.println(m1.genre);
        // System.out.println(m1.filmRating);
        // System.out.println(m1.language);
        // System.out.println(m1.year);
        // System.out.println(m1.country);
        // System.out.println(m1.director);
        // System.out.println(m1.subtitle);
        // System.out.println(m1.ost);

        // System.out.println("Second Movie ");
        // System.out.println(m2.title);
        // System.out.println(m2.genre);
        // System.out.println(m2.filmRating);
        // System.out.println(m2.language);
        // System.out.println(m2.year);
        // System.out.println(m2.country);
        // System.out.println(m2.director);
        // System.out.println(m2.subtitle);
        // System.out.println(m2.ost);

        System.out.println(" ");
        m1.display();
        m1.play();
        System.out.println(" ");
        m2.display();
        m2.play();
        
    }
}
