public class Yield{
    public static void main(String[]args){


        //java version 14 upper


        var nilaiAkhir = "D";
        String ucapan;

        //without yield
        switch (nilaiAkhir){
            case "A" -> ucapan ="Wow anda lulus dengan baik";

            case "B", "C" -> ucapan = " anda lulus ";

            case "D" -> ucapan = " anda tidak lulus ";

            default ->  ucapan = " mungkin anda salah jurusan";

        }

         //with yield
        String ucapan1 = switch (nilaiAkhir){
            case "A":
            yield "Wow anda lulus dengan baik";

            case "B", "C" : 
            yield " anda lulus ";

            case "D" : 
            yield " anda tidak lulus ";

            default :
            yield " mungkin anda salah jurusan";

        };

        System.out.println(ucapan);
        System.out.println(ucapan1);




    }
}