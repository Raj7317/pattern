import java.util.Scanner;

public class buttersfly {
    public static void main(String[] args) {
        System.out.println("enter th number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
          //  for(int j=1;j<=i-1;j++)
            //{
              //  System.out.print(" ");
            //}
            for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
}for(int j=1;j<=i-1;j++)
{
    System.out.print(" ");
}
System.out.println();
}}}
