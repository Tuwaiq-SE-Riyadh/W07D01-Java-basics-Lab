
import java.util.Random;
import java.util.Scanner;

public class averageNumber {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int cont= 0;
        System.out.println("Enter positive and negative numbers and 0 to exist");
        int read =x.nextInt();
        int total=0;
        int contPos=0;
        int contNeg=0;
        while (read!=0) {
            read =x.nextInt();
            if(read<0){
                contNeg++;
            }else{
                contPos++;
            }
            total+=read;
            cont++;
        }
        System.out.println("the Negative counter "+contNeg);
        System.out.println("the positive counter "+contPos);
        System.out.println("avarge numbers " +total/cont);

    }
}