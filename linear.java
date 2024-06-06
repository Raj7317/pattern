import java.util.Scanner;
public class linear {
    public static int linearsearchs(int array[] , int key,int size){
        for(int j=0;j<size;j++)
        {
            if(array[j]==key){
    return j;
            
        }}
        return -1;
        }
    public static void main(String[] args) {
        System.out.println("enetr the  array size ");
        int array []= new int[100];  
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
        System.out.println("enter the element ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();}
            System.out.println("enter the key");
            int key=sc.nextInt();
            int result=linearsearchs(array,key,size);
            if(result==-1){
                System.out.println("not found");
            }
            else{
                System.out.println(" found");
            }
        }}