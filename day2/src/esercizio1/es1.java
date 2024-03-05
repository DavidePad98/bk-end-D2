package esercizio1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        String pariOdispari = "Ciao mi chiamo Davide";
        if(pariOdispari.length() % 2 == 0 ) System.out.println("La stringa è pari" + " -> " + true);
        else System.out.println("La stringa è dispari" + " -> " + false);

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci l'anno per vedere se è bisestile");
        int num = Integer.parseInt(scan.nextLine());
        if(num%4==0 && num % 100 == 0 && num % 400 ==0) System.out.println(true);
        else System.out.println(false);
    }
}
