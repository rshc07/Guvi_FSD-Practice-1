import java.util.Scanner;

public class PurchaseDiscount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discount = 0.0;
        if (purchaseAmount <= 500)
        {
            System.out.println("There is no discount");
        } else if (purchaseAmount < 999)
        {
            discount = 0.1 * purchaseAmount;
        } else
        {
            discount = 0.2 * purchaseAmount;
        }
        double finalAmount = purchaseAmount - discount;
        System.out.println("Purchase Amount: ₹" + purchaseAmount);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}