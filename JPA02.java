public class JPA02 {
    public static void main(String[] args) {
        int i;
        int k;
        int a=0;
        for(i=1;i<=3;i++){
            a=a-1;
            for(k=1;k<=2;k++){
                a=a+5;
            }
        }
        System.out.print("count = "+a);
    }
}
