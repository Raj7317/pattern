import java.util.Scanner;
public class hollow7 {    
     public static void main(String[] args) {
        System.out.print("enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if( i==1||i==n||j==1||j==i){
             System.out.print("*");
            }
            else{
                System.out.print(" ");  
            }}
                System.out.println();   }}}