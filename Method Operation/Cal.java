import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n= in.nextInt();
        int r=Cuckoo(n);
        System.out.print(r);
    }
    static int Cuckoo(int n){
        if (n ==1){
            return 0;
        }
        else if (n ==2){
            return 1;
        }
        else{
            return 1*Cuckoo(n-1)+2*Cuckoo(n-1)+(3*1);
        }
    }
}
