import java.util.Scanner;

public class MagicNumber {
    public static int magicNumber(int num){
        if(num==0){
            return 0;
        }
        return magicNumber(num/10)+(num%10);
    }

    public static int print(int n){
        int val;
        val=magicNumber(n);
        while(val>9) {
                val = magicNumber(val);
        }
        if (val == 1) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int val= print(num);
        System.out.println(val);

    }
}