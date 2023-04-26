public class SwitchLambda{
    public static void main(String[]args){


        //java version 14 upper
        var nilaiAkhir = "D";

        switch (nilaiAkhir){
            case "A" -> System.out.println("Wow anda lulus dengan baik");

            case "B", "C" -> System.out.println(" anda lulus ");

            case "D" ->{
                System.out.println(" anda tidak lulus ");
            }  

            default ->  System.out.println(" mungkin anda salah jurusan");

            
        }


    }
}