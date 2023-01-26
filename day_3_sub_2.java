package pack1;

public class day_3_sub_2 {
//    classes and objects

    public static void main(String[] args){
        fan f1 = new fan();
        fan_f f2 = new fan_f();

        System.out.println(f1.blades);
        System.out.println(f1.color);
        System.out.println(f1.types+ '\n');

        f1.blows();
        f1.swing();

        System.out.println('\n'+"---- second fan ------"+'\n');

        System.out.println(f2.blades);
        System.out.println(f2.color);
        System.out.println(f2.types+ '\n');

        f2.blows();
        f2.swing();

    }
}
class fan{
    int blades = 3;
    String color = "crimson_blue";
    String types ="table_fan";

    void swing(){
        System.out.println("the fan swings");
    }

    void blows(){
        System.out.println("the fan is blowing");
    }

}
class fan_f {
    int blades = 4;
    String color = "red";
    String types ="ceiling_fan";

    void swing(){
        System.out.println("the fan swings");
    }

    void blows(){
        System.out.println("the fan is blowing");
    }

}
