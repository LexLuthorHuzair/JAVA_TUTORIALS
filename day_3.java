package pack1;

public class day_3 {
    public static void main(String[] args){
        int x =10;

//        while loop
        while (x<15){
            System.out.println(x);
            x++;
        }

//      for loop
        for (int a = 0; a < 10; a++)
        {
            System.out.println(a);
        }

//      if else

        int a1 = 2,b=8,c=9;
        if(a1>b){
            if(a1>c){
                System.out.println("a is the biggest");
            }
            else{
                System.out.println("c is the biggest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is the biggest");
            }
            else{
                System.out.println("c is the biggest");
            }
        }

//        do while
        int dw = 10;
        do{
            System.out.println(dw);
            dw++;
        }while(dw<10);

//        switch
        int op = 1;
        switch(op){
            case 1:
                System.out.println("day_1");
                break;
                case 2:
                System.out.println("day_1");
                break;
                case 3:
                System.out.println("day_1");
                break;
            default:
                System.out.println("this is default");
                break;
        }

    }
}

