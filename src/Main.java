import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Terning terning = new Terning(6);
        Terning terning2 = new Terning(6);
        int resultatet = terning.rul() + terning2.rul();

        System.out.println("Tryk K for at kaste terningerne");
        scan.next();

        System.out.println(resultatet);
        while(true){
            if (resultatet <10){
                System.out.println("Du slog: "+resultatet);
                break;
            }else if (resultatet >= 10) {
                System.out.println("Du slog højere end 10, slå igen");
                scan.next(); // rettet fra "k" til scan.next()
                terning = new Terning(6); // opretter nye terninger
                terning2 = new Terning(6);
                resultatet = terning.rul() + terning2.rul(); // opdaterer resultatet med den nye sum
                System.out.println(resultatet);
            }
        }
    }
}