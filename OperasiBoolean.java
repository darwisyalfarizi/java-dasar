public class OperasiBoolean{
    public static void main(String[]args){



        var absen = 75;
        var nilaiAkhir = 90;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;

        
        System.out.println(lulus);




    }
}