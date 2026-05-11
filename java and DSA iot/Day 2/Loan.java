/* 4 */
class Loan {
    String name;
    int loanAmount;
    int emiAmount;
    int noOfEmisPaid;
    int totalEmis;

    public void viewLoanDetails(){
        System.out.println("Name: " + name);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("EMI Amount: " + emiAmount);
        System.out.println("Number of EMIs Paid: " + noOfEmisPaid);
        System.out.println("Total EMIs: " + totalEmis);
    }

    public void payEmi(){
        if(noOfEmisPaid < totalEmis){
            noOfEmisPaid++;
            System.out.println("EMI paid successfully. Total EMIs paid: " + noOfEmisPaid);
        } else {
            System.out.println("All EMIs have already been paid.");
        }
    }

    public void checkEmiBalance(){
        int remainingEmis = totalEmis - noOfEmisPaid;
        System.out.println("Remaining EMIs: " + remainingEmis);
    }

    public static void main(String[] args) {
        Loan l = new Loan();

        // Assign values
        l.name = "Rohith";
        l.loanAmount = 100000;
        l.emiAmount = 5000;
        l.noOfEmisPaid = 2;
        l.totalEmis = 12;

        // Call methods
        l.viewLoanDetails();
        l.payEmi();
        l.checkEmiBalance();
    }
}