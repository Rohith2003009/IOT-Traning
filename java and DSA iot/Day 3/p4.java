public class p4 {
    public static void main(String[] args) {
        IT_company t = new tcs();
        t.softwareDevelopment();
    }
}

interface IT_company {
    public void softwareDevelopment();
    public void Hiring();
}

class tcs implements IT_company {
    @Override
    public void softwareDevelopment() {
        System.out.println("Developing Aadhar card Website ");
    }

    @Override
    public void Hiring() {
        System.out.println("They are Hiring only MCA Students");
    }
}