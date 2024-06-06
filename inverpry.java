import java.util.Scanner;
public class inverpry {
    public static void main(String[] args) {
        System.out.print("enter the number ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=1;j<=2*n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
        System.out.print(" "+j);
        }
      // System.out.print("*");}
    System.out.println();
}
}}