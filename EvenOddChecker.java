import java.util.Scanner;
public class EvenOddChecker{
static int num; // Global variable that will be shared between methods
    public static void main(String[] args){


        getintegerinput(); // this calls out the instructions for the user
        System.out.print(checkEvenOrOdd(num)); // this line takes the sum up  value and displays it


    }
    public static void getintegerinput(){ // This line prompt the user to input a number

        Scanner cram = new Scanner(System.in); 

        System.out.print("Enter an Integer: ");
        num = cram.nextInt();
        cram.close();

    }
    public static String checkEvenOrOdd(int num){ // This line Calculates and store the users input wether it is an odd or even numbers

        if(num % 2 == 0){

            return num+ " is an Evennumber";
        }
        else{

            return num+ " is an Odd number";
        }
        

    }

    
}