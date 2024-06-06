import java.util.Scanner;
public class plidrom { 
    public static void main(String[] args) {
        int r;
        System.out.println("enter trhe number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
            r=number;
            plidrom(number);
            
                }
                public static void plidrom(int n){
                    int rem,r; 
                    r=n;  
                  int sum=0;
                    while(n!=0){ 
                    rem=n%10;
                    sum=10*sum+rem;
                    n=n/10;}
                    if(r==sum){
                        System.out.println(" given number is  palidrom"+r );}
                        else{
                            System.out.println("given number is  palidrom"+r ); 
                }
            
            }}
    
