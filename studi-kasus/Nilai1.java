import java.util.Scanner;

public class Nilai1{
  
    public static void main (String []args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sistem Penilaian Univeristas");
        System.out.println("===============");

        System.out.print("NPM : ");
        String npm = input.nextLine();
        
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Nilai Tugas : ");
        int nTugas = input.nextInt();

        System.out.print("Nilai UTS : ");
        int nUts = input.nextInt();

        System.out.print("Nilai UAS : ");
        int nUas = input.nextInt();
        
          nTugas *= 0.2 ;
          nUts *= 0.3 ;
          nUas *= 0.5 ;

          int nAkhir = nTugas + nUas + nUts;
          String ket = "Tidak Lulus";

          if(nAkhir > 70){
             ket = "Lulus";
          }

        System.out.println("===============");
        System.out.println("Nilai Akhir : " + nAkhir );
        System.out.println("Keterangan : " + ket );

        System.out.println("                                ");


       


    }
}