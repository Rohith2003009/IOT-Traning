class bank{
    void Interest(){
        int intrest_rate = 10;
        System.out.println("The intrest rate is " +intrest_rate);
    }
}
class SBI extends bank{
    void Interest(){
        int intrest_rate = 8;
        System.out.println("The intrest rate is " +intrest_rate);
    }
}
public class Main {
    public static void main(String[] args) {
        bank b = new bank();
        b.Interest();
        SBI s = new SBI();
        s.Interest();
    }
}