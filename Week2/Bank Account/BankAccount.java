public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAllBalances = 0;

    public BankAccount() {
        numberOfAccounts++;
    }
    public BankAccount(double checkingDeposit, double savingsDeposit){
        checkingBalance = checkingDeposit;
        savingsBalance = savingsDeposit;
        numberOfAccounts++;
        totalAllBalances += (checkingDeposit + savingsDeposit);
    }

    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    public static double getTotalAllBalances(){
        return totalAllBalances;
    }

    public String getCheckingBalance(){
        return "Checking account balance: $" + this.checkingBalance;
    }

    public String getSavingsBalance() {
        return "Savings account balance: $" + this.savingsBalance;
    }

    public void makeDeposit(double deposit) {
        System.out.println("Please enter c for checking deposit or s for savings deposit:");
        String depositChoice = System.console().readLine();
        if (depositChoice.indexOf("c") > -1) {
            this.checkingBalance += deposit;
            System.out.println("$" + deposit + " has been deposited into your checking account.");
            System.out.println(this.getCheckingBalance());
            totalAllBalances += deposit;
        }
        else if (depositChoice.indexOf("s") > -1) {
            this.savingsBalance += deposit;
            System.out.println("$" + deposit + " has been deposited into your savings account.");
            System.out.println(this.getSavingsBalance());
            totalAllBalances += deposit;
        }
        else {
            System.out.println("Please try deposit again and make a valid account choice.");
        }
    }

    public void makeWithdrawal(double withdraw) {
        System.out.println("Enter c to withdraw from checking of s to withdraw from savings:");
        String withdrawChoice = System.console().readLine();
        if (withdrawChoice.indexOf("c") > -1) {
            if (withdraw <= this.checkingBalance) {
                this.checkingBalance -= withdraw;
                System.out.println("$" + withdraw + " has been withdrawn from your checking account.");
                System.out.println(this.getCheckingBalance());
                totalAllBalances -= withdraw;
            }
            else{
                System.out.println("Insufficient funds for withdrawal.");
            }
        }
        else if (withdrawChoice.indexOf("s") > -1) {
            if (withdraw <= this.savingsBalance) {
                this.savingsBalance -= withdraw;
                System.out.println("$" + withdraw + " has been withdrawn from your savings account.");
                System.out.println(this.getSavingsBalance());
                totalAllBalances -= withdraw;
            }
            else{
                System.out.println("Insufficient funds for withdrawal.");
            }
        }
        else{
            System.out.println("Please make withdrawal again and make valid account choice.");
        }
    }

    public String checkAllAccounts() {
        System.out.println(this.getCheckingBalance());
        System.out.println(this.getSavingsBalance());
        return "Total monies in all your accounts: $" + (this.checkingBalance + this.savingsBalance);
    }
}
