import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of arrzy");
        int size=sc.nextInt();
        System.out.print("enter the element of arrzy");
        int array[]=new int[100];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("enter the element thet you want to search ");
        int key=sc.nextInt();
        int first=0;
        int last=array.length-1;
      // int  mid=first+last/2;
       while(first<=last){
        int  mid=(first+last)/2;
         if(array[mid]==key){
        System.out.println("found");
       }
       else if(array[mid]>key){
        last=mid-1;}
       else{
        first=mid+1;
       }}
       System.out.println("not found");
    }

}
