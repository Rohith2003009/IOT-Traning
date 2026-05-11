// Method Overloading

public class p2 {

    public static void main(String[] args) {
        summation S = new summation();
        S.math_method("Rahul", "Dravid");
    }
}

class summation {

    void math_method(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    void math_method(int a, int b, int c) {
        double Mul = a * b * c;
        System.out.println(Mul);
    }

    void math_method(String s1, String s2) {
        String s = s1 + s2;
        System.out.println(s);
    }
}