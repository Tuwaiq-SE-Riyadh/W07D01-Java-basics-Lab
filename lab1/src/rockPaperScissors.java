    import java.util.Random;
        import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 0 to Scissors , 1 to Rock or 2 Paper");
        int read =x.nextInt();
        if (read == 0){
            System.out.println("0 : I chose Scissors" );
        }
        if (read == 1){
            System.out.println("1 : I chose  Rock" );
        }
        if (read == 2){
            System.out.println("2 : I chose  Paper" );
        }
        Random rand = new Random();
        int max=2;
        int min=0;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        if (randomNum == 0){
            System.out.println("0 :computer chose  Scissors" );
        }
        if (randomNum == 1){
            System.out.println("1 :computer chose  Rock" );
        }
        if (randomNum == 2){
            System.out.println("2 :computer chose  Paper" );
        }

    }
}