import java.util.Scanner;

public class lcm { 
    public static int calculatelcmmain(int n1,int n2) {
    

   int cm=0 ;
   cm=(n1>n2)?n1:n2;
   while(true){
if(cm%n1==0&&cm%n2==0){
    return cm;
}
cm++;
   }
   
}
public static void main(String[] args) {
   // int n1=Integer.parseInt(args[0]);
   // int n2=Integer.parseInt(args[1]);
   Scanner Input=new Scanner(System.in) ;
System.out.print("enetr the first number ");
   int n1=Input.nextInt();
System.out.print("enetr the second number ");
int n2=Input.nextInt();
    System.out.println(calculatelcmmain(n1,n2) );
}
}
