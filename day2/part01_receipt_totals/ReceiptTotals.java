package day2.part01_receipt_totals;

public class ReceiptTotals {

    public static void main(String[] args) {
        printReceiptSummary();
        printClosingCountdown();
    }

    // Scenario:
    // A store sold items numbered 100 through 105.
    // Each item costs $5.
    // Every 3rd item starting at 100 is on sale for $3 instead.
    public static void printReceiptSummary() {
        int totalCost = 0;
        //Loop through all items from 100 to 105
        for(int itemNumber = 100; itemNumber <= 105; itemNumber ++) {
            // the modulo operator (%) will give the leftover after integer division
            if((itemNumber - 100) % 3 == 0){
                totalCost += 3;
            } else {
            //take a running total
            //where every item is $5
            totalCost += 5;
            }
        }

        System.out.println("total cost: $" + totalCost);

    }

    // Print a countdown from 5 down to 0 on one line.
    public static void printClosingCountdown() {
        for (int i = 5; i >= 0; i --){
            System.out.print(i + " ");
        }
    }
    
}
