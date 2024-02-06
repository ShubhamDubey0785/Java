import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt(); 
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(p==q){
            System.out.println("Equal");
        }else if(p>q){
            System.out.println("p is greater than q");
        }else{
            System.out.println("P is less than q");
        } 

        int button=sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }else if(button==2){
            System.out.println("Namaste");
        }else if(button==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid input");
        }

        switch (button) {
            case 1:
            System.out.println("Hello");
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}