    //WAP to sort array in descending order
    import java.util.*;
    public class Q72{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size=sc.nextInt();
            int array[]=new int[size];


            for(int i=0;i<array.length;i++){
                System.out.print("Enter element at "+i+" index ");
                array[i]=sc.nextInt();

            }
            for(int i=1;i<array.length-1;i++){
    for(int j=0;j<array.length-i;j++){
        if(array[j] < array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
        }
    }
}
            System.out.print("The sorted array in descending order is : " );
            for (int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }


        }
    }