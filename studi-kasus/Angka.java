import java.util.Scanner;

public class Angka{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        
        System.out.print("Input Sebuah  Bilangan  : ");
        int angka = input.nextInt();
        
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.print("Bilangan tersebut dapat dibagi angka 3 dan 5  ");
        }else{
            System.out.print("Bilangan tersebut tidak dapat dibagi angka 3 dan 5  ");
        }
        System.out.println("                                ");
        
        
    }
}