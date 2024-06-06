import java.util.Scanner;
public class peak 
{
    public static void main(String[] args)
     {  
        System.out.print("enter the numberv of element"); 
    Scanner Input = new Scanner(System.in);
        int number= Input.nextInt();
        int[] arry = new int[100]; 
        System.out.println("Enter the elements of the array: ");  
     for(int i=0; i<number; i++) 
 {
    arry[i]=Input.nextInt();  
   }   for(int i=1; i<number-1; i++) {
        //while(arry[i]!=0){
  if(arry[i]>arry[i+1]){
    if(arry[i]>arry[i-1]){
        System.out.println("peak element is "+arry[i]);
    }
  }System.out.println(" No peak element  ");
        }
       }
       
}

