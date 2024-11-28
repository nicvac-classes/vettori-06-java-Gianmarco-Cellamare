//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        int n,i,iMin;
        System.out.println ("Quanti atleti ci sono in gara?");
        n=in.nextInt();
        String [] nomi=new String[n];
        String [] nazionali=new String[n];
        Double [] tempi=new Double[n];

        for(i=0; i <= n-1; i++){
            System.out.println("nome " +i+1+ "° atleta: ");
            nomi=in.nextline();
            System.out.println("Nazionale " +i+1+ "° atleta: ");
            nazionali=in.nextline();
            System.out.println("Tempo " +i+1+ "° atleta: ");
            tempi=in.nextDouble();
        }

        System.out.println("Informazioni inserite");
        for (i = 0; i <= n -1; i++){
            System.out.println(+i+1+ "° atleta: " +nomi[i]+ "; nazionale: " +nazionali[i]+ "; tempo" +tempi[i]);
        }

        System.ot.println("Ricerca dell'atleta vincitore");
        double min;

        iMin = 0;
        min = tempi[0];
        for (i = 0; i <nomi.length(); i++){
            if (tempi[i] <min){
                iMin = i;
                min = tempi[i];
            }
        }

        System.out.println("Atleta vincitore: " +nomi[iMin]+ "; nazionale: " +nazionali[iMin]+ "; tempo: " +tempi[iMin]);




    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md