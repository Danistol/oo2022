import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Failikirjutamine {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("valjund1.txt"));
        pw.println("Teretere, vana kere");
        pw.print("Juku");
        pw.print(" Cukku");
        pw.close();
    }
}
