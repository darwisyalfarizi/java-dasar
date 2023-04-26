public class TernaryOperator{
    public static void main(String[]args){



        var nilai = 90;

        //without ternary
        String ucapan;
        if(nilai >= 75 ){
            ucapan = "lulus";

        }else{

            ucapan = "tidak lulus";

        }

        //with ternary
        String ucapan1 = nilai >=75 ? "lulus" : "tidak lulus";

        System.out.println(ucapan);
        System.out.println(ucapan1);





    }
}