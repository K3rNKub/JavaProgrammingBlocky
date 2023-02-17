import java.util.Scanner;
public class Ex4
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("EnterNumber1: ");
int number1 = input.nextInt();
System.out.print("EnterNumber2: ");
int number2 = input.nextInt();
   
System.out.print("EnterNumber3: ");
int number3 = input.nextInt();

    

    if(number1 > number2){
         if (number1 > number2){
            System.out.println(" Maximam number is "+number1 );
        }
        else {
            System.out.println(" Maximam number is "+number3 );
        }
    }
    else if (number2 > number3){
        System.out.println(" Maximam number is "+number2 );
    }
    else {
        System.out.println(" Maximam number is "+number3 );
    }

}
}