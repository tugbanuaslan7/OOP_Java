public class EigtheenPercentTax implements TaxableBehavior{

    @Override
    public double getTax(double price) {
       return price * .18;
    }
    
}
