import java.util.Scanner; 
public class hellowrectangle {
public static void hellowrectangle ( int r , int c){
//int r,c;
       for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
            if(i==1||i==r||j==1|| j==c){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    
    System.out.println();
            }
        }
            public static void main(String[] args){
                System.out.print("enter the number of row");
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        System.out.print("enter the number of column");
        int col= sc.nextInt();
        hellowrectangle(row, col);
        }
    }