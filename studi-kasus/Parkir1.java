import java.util.Scanner;

public class Parkir1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan no kendaraan : ");
        String angka = input.nextLine();

        System.out.print("Lama Parkir : ");
        int lama = input.nextInt();

        int tarif = lama * 2000;

        if(tarif > 20000){
            tarif = 20000;

        }
            System.out.print(tarif);
        
    }
}