import java.util.Scanner;

public class halfprynum {public static void main(String[] args){
    System.out.print("enter the number of number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
      
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n+1-i;j++){
          System.out.print(j);
          
            }
            System.out.println();
            
        }
}
}
