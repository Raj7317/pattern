import java.util.Scanner;
public class floydtrangle {
     
        public static void main(String[] args){
    System.out.print("enter the number of number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }System.out.println();
            
        }
      
       
        }
}
