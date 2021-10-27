import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        int x;
        System.out.println("Enter any year");
        Scanner r = new Scanner(System.in);

        x=r.nextInt();

        if(x%100==0 && x%400==0 || x%100!=0 && x%4==0){
            System.out.println("Leap Year");
        }

        else{
            System.out.println("Not Leap Year");
        }
    }
}

