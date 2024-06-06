import java.util.Scanner;

public class heart {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of row ");
        int n=sc.nextInt();
       // System.out.print("enter the number of col ");
        //int c=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3-i;j++){
        System.out.print(" ");}
        for(int j=1;j<=2*i+2;j++){
            System.out.print("*");}
            for(int j=1;j<=3-i;j++){
                System.out.print(" ");}
                for(int j=1;j<=2*i+2;j++){
                    System.out.print("*");}
       System.out.println();}}}
  


