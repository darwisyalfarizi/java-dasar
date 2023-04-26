import java.util.Scanner;
public class Bilangan{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        

        System.out.println("Program menentukan nilai terbesar ");
        System.out.print("Input Bilangan Pertama : ");
        int bil1 = input.nextInt();

        System.out.print("Input Bilangan Kedua : ");
        int bil2 = input.nextInt();

        int maks = bil2;
        if(bil1 > bil2){
            maks = bil1;
        }
        System.out.println("===================================");
        System.out.println("Bilangan terbesar adalah : " + maks);

        System.out.println("                                ");
        
        
    }
}