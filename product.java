import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner numbers= new Scanner(System.in);
        System.out.print("enter the first number");
        int num1=numbers.nextInt();
        System.out.print("enter the second number");
         int num2=numbers.nextInt();
        double result = multiply(num1,num2);
        System.out.println("multipe of first number and second number is " +result);  
    } 

public static int multiply( int num1, int num2){
    int product= num1*num2;
    return product ;

}
}

