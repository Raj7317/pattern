import java.util.Scanner;
public class hollow {
    public static void main(String[] args) {
        System.out.print("enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print(" "); }
            for(int j=1;j<=2*i-1;j++){
            if(i==1||i==n||j==1||j==2*i-1){
             System.out.print("*");
            }
            else{
                System.out.print(" ");}}
                    System.out.println();   }}}
         
