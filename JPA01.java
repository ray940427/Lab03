import java.util.Scanner;
public class JPA01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Input:");
        int a=scn.nextInt();
        int i ,b=0;
        for(i=1;i<=a;i++){
             b=i+b;
        }
        System.out.println("1 + ... + "+a+" = "+b);
    }
}
