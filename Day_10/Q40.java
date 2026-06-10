//WAp to print character pyramid
import java.util.*;
public class Q40{
    public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();

for(int i=1;i<=num;i++){
    for(int j=1;j<num-i+1;j++){
        System.out.print(" ");
    }
for(char ch='A';ch<='A'+i-1;ch++){
    System.out.print(ch);

}
 for(char ch=(char)('A'+i-2);ch>='A';ch--){
System.out.print(ch);
}
System.out.println();
}

    }
}