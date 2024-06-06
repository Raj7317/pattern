 import java.util.Scanner;
public class prime1 {
    public static void main(String[] args) {
        System.out.print("enter the number ");
        Scanner Input = new Scanner(System.in);
        int number= Input.nextInt();
        check(number);
       // check(11);
}
public static void check(int num){
     int flag=0;
    if(num==0||num==1){
        System.out.println(num+" is not prime number");  
    }
    else{
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not prime number"); 
                flag++; 
                break; 
             
            }
        }}
            if(flag==0){
                System.out.println(num+" is prime number"); 
            }
        }
    
}
