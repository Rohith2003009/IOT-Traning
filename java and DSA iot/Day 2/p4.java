//method with parameter, with return value//
//parameter c,method should return F,F=9/5*c=32//

public class p4{
    public static void main(String[] args){
        float f = fahrenheit(35);
        System.out.println("The fahrenheit value is "+f);
    }
    static float fahrenheit(float c){
        float f = (9/5*c) + 32;
        return f;
    }

}