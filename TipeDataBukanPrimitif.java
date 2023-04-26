public class TipeDataBukanPrimitif{
    public static void main(String[]args){

        Integer iniInteger =100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.print(iniByte);

        int iniInt = 100;

        Integer iniInteger1 = iniInt;

        //konversi data primitif ke bukan

        int age = 30;
        Integer ageObject = age;

        int ageAgain = ageObject;

        //int to short 
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();



    }
}