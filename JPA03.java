public class JPA03 {
    public static void main(String[] args) {
        System.out.print("1~1000中的完美數有:");
        for(int i=1;i<=1000;i++){
            int c=0;
            for(int k=1;k<i;k++){
                
                if(i%k==0){
                    c+=k;
                }
            }
            if(i==c){
                System.out.print(i+" ");        
            }
            
        }

    }
}
