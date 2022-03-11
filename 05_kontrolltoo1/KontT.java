//Trips-traps-trull
import java.util.Scanner;

public class KontT {
    static String[] laud;
    static String kord;


    static void TeeLaud() {
        System.out.println("|---|---|---|");
        System.out.println("| " + laud[0] + " | " + laud[1] + " | " + laud[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + laud[3] + " | " + laud[4] + " | " + laud[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + laud[6] + " | " + laud[7] + " | " + laud[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        laud = new String[9];
        kord = "X";
        for (int a = 0; a < 9; a++) {
            laud[a] = String.valueOf(a + 1);
        }
        TeeLaud();
        System.out.println("Siin saad sisestada numbri, mille asemel soovid panna oma märgi. Esimesed on X");
        for (int b = 0; b < 9;) {
            Integer sisse = scanner.nextInt();
            if (laud[sisse - 1] != "X" && laud[sisse - 1] != "O") {
                laud[sisse - 1] = kord;
                if (kord == "X") {
                    kord = "O";
                    b++;
                } else {
                    kord = "X";
                    b++;
                }
                TeeLaud();
            } else {
                System.out.println("See koht on juba täis, proovi mingi muu");
            }
        }
        System.out.println("Mäng on lõppenud!");
    }
}