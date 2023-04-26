import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nilai{

    public static void main (String []args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        

        System.out.println("Sistem Penilaian Univeristas");
        System.out.println("===============");

        System.out.print("NPM : ");
        String npm = input.readLine();
        
        System.out.print("Nama : ");
        String nama = input.readLine();

        System.out.print("Nilai Tugas : ");
        int nTugas = Integer.parseInt(input.readLine());

        System.out.print("Nilai UTS : ");
        int nUts = Integer.parseInt(input.readLine());

        System.out.print("Nilai UAS : ");
        int nUas = Integer.parseInt(input.readLine());
        
          nTugas *= 0.2 ;
          nUts *= 0.3 ;
          nUas *= 0.5 ;

          int nAkhir = nTugas + nUas + nUts;

        System.out.println("===============");
        System.out.println("Nilai Akhir : " + nAkhir );
        

       


    }
}