import java.util.Scanner;


public class Testtreiber {
    public static void main(String[] args){
        // Eingabe
        System.out.println("Bitte geben Sie für die Berechnung der Zifferensumme eine ganze positive Zahl ein: ");
        Scanner sc = new Scanner(System.in);
        int ziffernsumme2 = 0;
        int eingabeZahl = sc.nextInt();
       ziffernsumme2 = Auf_24_Methoden.berechnungZiffernsumme(eingabeZahl);
        System.out.println(ziffernsumme2);
        sc.close();

    }

}

