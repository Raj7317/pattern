import java.util.Scanner;

public class rotate
 {
     public static void main(String[] args)
   {  int i;
        System.out.print("enter the numberv of element"); 
    Scanner Input = new Scanner(System.in);
        int number= Input.nextInt();
        int[] arry = new int[100]; 
        System.out.println("Enter the elements of the array: ");  
     for( i=0; i<number; i++) 
 {
    arry[i]=Input.nextInt();  
   }  

    System.out.print("enter the number   ");
            int n= Input.nextInt();
            for( i=n;i<number;i++)
       {
        System.out.println(arry[i]);
           }   
     {
            for( i=0;i<=n-1;i++)
        System.out.println(arry[i]);
           }
    }
}