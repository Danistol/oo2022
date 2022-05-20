package KoduneTöö;
import java.util.Objects;
import java.util.Scanner;



public class Figuurid {
    class Ruut implements FiguuriLahendamine{

        @Override
        public void kuljed(int kulg1, int kulg2, int kuld3) {
            System.out.println("Ruudu pindala on " + (kulg1 * kulg2));
        }
    }

    class Kolmnurk implements FiguuriLahendamine{
        public void kuljed(int kulg1, int kulg2, int kuld3){
            System.out.println("Võrdkülgse kolmurga pindala on " + (kulg1 * kulg2 * kuld3));
        }
    }

    class Lahendamine{
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kas soovid lahendada ruudu või kolmnurga");

            String valik = scanner.nextLine();
            if(Objects.equals(valik, "Kolmnurg") || Objects.equals(valik, "kolmnurg")){
                Kolmnurk kolmnurk = new Kolmnurk();
                int Kulg1 = Integer.parseInt(scanner.nextLine());
                int Kulg2 = Integer.parseInt(scanner.nextLine());
                int Kulg3 = Integer.parseInt(scanner.nextLine());
                kolmnurk.kuljed(Kulg1, Kulg2, Kulg3);

            }

        }

    }
}
