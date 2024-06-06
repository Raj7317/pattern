import java.util.Scanner;

public class divides35 {
    public static void main(String[] args) 
    { 
        int t;
        System.out.print("enter the number of elemen you want to store in array  ");
        Scanner Input = new Scanner(System.in);
        int number= Input.nextInt();
        int[] array = new int[100]; 
        System.out.println("Enter the elements of the array: ");  
     for(int i=0; i<number; i++) 
 {
    array[i]=Input.nextInt();  
   }  
       System.out.print("enter the number tha you want to search or divide the number   ");
            int n= Input.nextInt();
        for(int i=0; i<number; i++)
     {
        if(array[i]%n==0)
       {
       System.out.println(array[i]);
          }
       else
       {
          t=array[i];
       while( array[i]!=0)
       {
        if( array[i]%100==n)
        {
            System.out.println(t);
        }
        array[i]=(array[i]/10 );      }
          }
       }   
     }    
  }
      
    




