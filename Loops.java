import java.util.*;
public class Loops {
    public static void main(String[] args) {
        // for(int i=0;i<3;i++){
        //     System.out.println("Hello "+i);
        // }
        // int j=0;
        // while(j<11){
        //     System.out.println(j);
        //     j++;
        // }

        // int k=0;
        // do{
        //     System.out.println("Do while loop"+k);
        // }while(k<5);

        Scanner sc=new Scanner(System.in);
        // int inp=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<inp;i++){
        //     sum+=i;
        //     // System.out.println(sum);
        // }
        // System.out.println(sum);
        int tab=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(tab*i);
        }
    }
}
