package eksperimen.LatihanArray;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Mogoodiyai", 100);
        Hero hero2 = new Hero("Noel", 100);
        AgilityHero hero3 = new AgilityHero("Ocky", 100);
        IntelHero hero4 = new IntelHero("Aprilio", 100);
        
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);

        System.out.println("Ini Tampilan Awal : " + heroes + "\n");
        heroes.get(2).display();
        heroes.get(3).display();
        
        System.out.println("\nMerubah index ke 3 menjadi Marsel");
        
        heroes.set(3, hero4).name = "Marsel";
        
        heroes.get(2).display();
        heroes.get(3).display();
        
        System.out.println("\nMenghapus index ke 3");
        heroes.remove(3);
        System.out.println("Ini Tampilan Akhir : " + heroes + "\n");

        System.out.println("\nMethod heroes.size() : " + heroes.size());

        System.out.println("\nMethod heroes.contains(hero2) : " + heroes.contains(hero2));

        System.out.println("\nMethod heroes.indexOf(hero4) : " + heroes.indexOf(hero3));

    }
}
