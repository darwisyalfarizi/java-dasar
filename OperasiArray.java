public class OperasiArray{
    public static void main(String[]args){


        // array[index] => mengambil data di array
        // array[index] = value; => mengubah data di array
        // array.length => mengambil panjang data di array
        
        
        long[] arrayLong ={
            10, 90, 90, 80, 12,
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

    }
}