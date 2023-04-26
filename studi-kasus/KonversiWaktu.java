import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class KonversiWaktu{


    public static void main (String []args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    

        System.out.println("Konversi detik ke menit");
        System.out.println("===============");

        System.out.print("Input Angka (detik) : ");
        int angka = Integer.parseInt(input.readLine());
        

      

        int menit = angka /60;
        int detik = angka %60;

        System.out.println("===============");

        System.out.println(angka + " detik = " + menit + " menit " + detik + " detik");



       


    }
}