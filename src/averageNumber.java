import java.util.Scanner;

class AverageNumber{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("How Many Numbers you want to enter: ");
        int enteredNum = num.nextInt();
        int total = 0;
        for (int i=0;i<enteredNum;i++){
            int numbers = num.nextInt();
            if (numbers>=0){
                System.out.println("It is Positive");
            }
            else {
                System.out.println("It is Negative");
            }
            total +=numbers;
        }
        float average =  ((float)total/(float)enteredNum) ;
        System.out.println("Your Total is : "+total+" and the average is: "+ average);
    }
}