import java.util.Scanner;


public class Testtreiber {

    public static int main(String [] args){
        Scanner sc = new Scanner(System.in);
        int eingabeZahl;
        int test = 0;
        int ziffernsumme = 0;
        eingabeZahl = sc.nextInt();
       test = Auf_24_Methoden.berechnungZiffernsumme(ziffernsumme, eingabeZahl);
        System.out.println(test);
        sc.close();
        return eingabeZahl;
    }

}

