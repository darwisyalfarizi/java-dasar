import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gaji{


    public static void main (String []args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Aplikasi Karyawan");
        System.out.println("===============");

        System.out.print("Input Nama : ");
        String nama = input.readLine();

        System.out.print("Input Gaji : ");
        int gaji = Integer.parseInt(input.readLine());


        final double pajak = 0.11 * gaji;

        double totalGaji = gaji - pajak;

        System.out.println("===============");

        System.out.println("Pajak : " + pajak);
        System.out.println("Total Gaji : " + totalGaji);



    }
}