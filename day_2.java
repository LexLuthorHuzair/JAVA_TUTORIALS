package pack1;

public class day_2 {
    public static void main(String [] args){

//    primitive data types

        int a = 10;
        float b = 5.55f;
        double c  = 5.555;
        char d = 'f';
        String s = " this is a string";
        boolean bd = true;

//        Arithmetic expressions
        int x  = 34;
        int y = 45;
        System.out.println("addition" + x+y);
        int sub = x-y;
        System.out.println("sub"+ sub);
        System.out.println("divide" + x/y);
        System.out.println("modulus" + x%y);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        
//      Decision making
        if(x ==24){
            System.out.println("the number is not equal");
        }
        else if (x ==34){
            System.out.println("the number is equal");
        }
        else{
            System.out.println("this doesnt satisfy condition");
        }


    }
}
