package esercizio4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero da cui partire per il conto alla rovescia");
        int num = Integer.parseInt(scan.nextLine());
        for (int i = num; i <= 100; i--) {
            if(i == -1) break;
            System.out.println(i);
        }
    }
}
