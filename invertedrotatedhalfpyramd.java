import java.util.Scanner;
public class invertedrotatedhalfpyramd {
public static void main(String[] args){
    System.out.print("enter the number of row");
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        System.out.print("enter the number of column");
        int c= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");}
                for( int j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println();}}}

