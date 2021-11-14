import java.util.Scanner;


class MyClass{

public static void main(String[] args) {
    int randomNum = (int)(Math.random() * 3);
    Scanner myChoice = new Scanner(System.in);
//    System.out.println(randomNum);
    System.out.print("Enter 0 for Scissors or 1 for Rock or 2 for Paper: ");
    int x = myChoice.nextInt();
    if (x==0 && randomNum==1){
        System.out.println("Unfortunately, you lost");
    }
    else if(x==1 && randomNum==2){
        System.out.println("Unfortunately, you lost");
    }
    else if(x==2 && randomNum==0){
        System.out.println("Unfortunately, you lost");
    }
    else if(x==0 && randomNum==2){
        System.out.println("Congratulations you won");
    }
    else if(x==1 && randomNum==0){
        System.out.println("Congratulations you won");
    }
    else if(x==2 && randomNum==1){
        System.out.println("Congratulations you won");
    }
    else {
        System.out.println("DRAW");
    }
}
}