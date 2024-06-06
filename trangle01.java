import java.util.Scanner;

public class trangle01 {
    public static void main(String[] args){
    System.out.print("enter the number of number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
              }  }System.out.println();
        }
    }
}
