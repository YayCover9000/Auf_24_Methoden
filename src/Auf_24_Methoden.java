
public class Auf_24_Methoden {
    public static int berechnungZiffernsumme(int eingabeZahl) {
        int zaehler;
        int ziffernsumme = 0;
        // Initialisierung mit 0 für Rückgabe im
        // Fehlerfall und bei Addition wichtig!




        zaehler = eingabeZahl;

        // Berechnung der Ziffernsumme
        while (zaehler > 0) { // Beinhalte die Prüfung, dass Zahl der Eingabe positiv ist
            ziffernsumme = ziffernsumme + (zaehler % 10); // Einerstelle zur Summe
            // addierenn
            // Es kann auch bei Integer.MAX_VALUE nicht zum Überlauf
            // kommen
            zaehler = zaehler / 10; // Einerstelle abschneiden

        }

        // Ausgabe
        if (ziffernsumme > 0) { // Ziffernsumme muss nach einer Berechnung groeßer 0 sein.
            System.out.println("Das Ergebnis zur Berechnung der Ziffernsumme von " + eingabeZahl + " lautet "
                    + ziffernsumme + ".");
        } else {
            System.out.println("Sie haben einen falschen Wert eingegeben.");
        }
        return ziffernsumme;
    }
}
