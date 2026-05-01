import java.util.ArrayList;
import java.util.Scanner; 
public class AppMadonna {
    public static void main(String[] args) {

        Album album = new Album ("Madonna", 1983, 5000.00);
        Album album2 = new Album ("Like a Virgin" , 1984, 10000.00);
        Album album3 = new Album ("True Blue", 1986, 7.000);
        Album album4 = new Album ("Like a Prayer",  1989, 5.000);
        Album album5 = new Album ("Erotica" , 1992, 1.989);
        Album album6 = new Album ("Bedtime Stories", 1994, 2.531);
        Album album7 = new Album ("Ray of Light", 1998, 4.359);
        Album album8 = new Album ("Music", 2000, 3.031);
        Album album9 = new Album ("American Life", 2003, 680.000);
        Album album10 = new Album ("Confessions on a Dance Floor", 2005, 1.734);
        Album album11 = new Album("Hard Candy", 2008, 751.000);
        Album album12 = new Album ("MDNA", 2012, 539.000);
        Album album13 = new Album ("Rebel Heart", 2015, 238.000);
        Album album14 = new Album ("Madame X", 2019, 169.000);
        Album album15 = new Album ("Confessions II", 2026, 0.000);


        ArrayList<Album> DISCOGRAFIA = new ArrayList<>();
        DISCOGRAFIA.add(album);
        DISCOGRAFIA.add(album2);
        DISCOGRAFIA.add(album3);
        DISCOGRAFIA.add(album4);
        DISCOGRAFIA.add(album5);
        DISCOGRAFIA.add(album6);
        DISCOGRAFIA.add(album7);
        DISCOGRAFIA.add(album8);
        DISCOGRAFIA.add(album9);
        DISCOGRAFIA.add(album10);
        DISCOGRAFIA.add(album11);
        DISCOGRAFIA.add(album12);
        DISCOGRAFIA.add(album13);
        DISCOGRAFIA.add(album14);
        DISCOGRAFIA.add(album15);

        System.out.println("Digite um album da Madonna: ");
        Scanner scanner = new Scanner (System.in);
        String titulo = scanner.nextLine();

        boolean encontrou = false; 

        for (Album a : DISCOGRAFIA) {
            if (a.getTitulo().equalsIgnoreCase(titulo)) {
            a.getDados();
            encontrou = true;

            System.out.println("---------------------");
            }
        }

        if (!encontrou) {
            System.out.println("Esse título não foi encontrado. Tente novamente.");
        }
        System.out.println("Total de albuns listados= " + DISCOGRAFIA.size());

        scanner.close();
    }
}
