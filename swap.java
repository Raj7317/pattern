import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
     Scanner Input=new Scanner(System.in) ;
System.out.print("enetr the first number ");
   int num1=Input.nextInt();
System.out.print("enetr the second number ");
int num2=Input.nextInt();
System.out.println("Before Swapping\nfirst number= "+num1+"\nsecond number = "+num2); 
swaps(num1,num2);
System.out.println();
    }
    public static void  swaps (int num1,int num2)
    {
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.print("After Swapping\nfirst number= "+num1+"\nsecond number = "+num2);

    }

    }
    

