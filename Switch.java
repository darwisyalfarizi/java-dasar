public class Switch{
    public static void main(String[]args){



        var nilaiAkhir = "D";

        switch (nilaiAkhir){
            case "A":
            System.out.println("Wow anda lulus dengan baik");
            break;

            case "B":
            case "C":
            System.out.println(" anda lulus ");
            break;

            case "D":
            System.out.println(" anda tidak lulus ");
            break;

            default:
            System.out.println(" mungkin anda salah jurusan");

        }


    }
}