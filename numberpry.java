import java.util.Scanner;
public class numberpry {
    public static void main(String[] args) { int r,p;
        System.out.print("enter the number ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            r=i;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            } 
        
            // r=i;
            for(int j=1;j<=i;j++){
                System.out.print(r+" ");
                r++;}       
                r=2*i-2;
        
                for(int j=1;j<i;j++)
                { 
                    //r=2*i;
                    System.out.print(r+" ");
                     r--;
                }
                
            System.out.println();
        }


    }}