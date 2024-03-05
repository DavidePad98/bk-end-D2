package esercizio3;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Inserisci una frase per dividerla");
            String frase = scan.nextLine();
            String[] lettere = frase.split("");
            String out = String.join(",", lettere);
            System.out.println(out);
        if(frase.equals(":q")){
            System.out.println("Fine :'(");
            break;
        }
        }
    }
}
