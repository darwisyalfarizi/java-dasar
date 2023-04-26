public class ForEach{
    public static void main(String[]args){

        

        

        String[] names  ={
            "asd","fgh","jkl","mnb"
        };

        //without foreach
        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        //with foreach
        for(var name: names){
            System.out.println(name);
        }

    }
}