import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int goal = 0;
        for (int i = 0; i <= 10; i++){
            goal += i;
        }
        return goal;
    }

    public double getOrderTotal(double[] lineItems) {
        double total = 0.0;
        for (int i = 0; i < lineItems.length; i++) {
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.printf("There are %s people in front of you\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int max) {
        System.out.println(product);
        for (int i = 1; i <= max; i++) {
            System.out.println(i + " - $" + price*i + "\n");
        }
    }
}
