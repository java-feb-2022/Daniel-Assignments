public class TestBankAccount {
    public static void main(String[] args) {
        
        // Basic Constructor
        BankAccount account1 = new BankAccount();

        // Overloaded Constructor
        BankAccount account2 = new BankAccount(100, 1000);
        
        // Check Balances Test
        System.out.println("\n----- Check account Balances Test ------");
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());

        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());

        // Deposit Test
        account2.makeDeposit(500);
        account1.makeDeposit(300);
        account1.makeDeposit(200);

        // Withdraw Test
        account1.makeWithdrawal(400);
        account1.makeWithdrawal(400);
        account2.makeWithdrawal(300);

        // Check All Accounts
        account1.checkAllAccounts();
        account2.checkAllAccounts();

        // Static Methods Tests
        System.out.println("\n----- Static Methods Tests ------");
        System.out.println("Total number of bank accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total of all balances: $" + BankAccount.getTotalAllBalances());
    }
}
