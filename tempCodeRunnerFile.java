public class MethodVariableArgument{
    public static void main(String[]args){
        
        int [] values1 = {72,89,90,24,87};
        sayCongrats(name:"assa", values1);
    }

    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value: values){
        total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat" + name + ", Anda lulus");
        }else {
            System.out.println("Maaf" + name + ", Anda tidak lulus");

        }

        return total;
    }
}