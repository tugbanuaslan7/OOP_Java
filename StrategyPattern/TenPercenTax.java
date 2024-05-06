public class TenPercenTax implements TaxableBehavior{

    @Override
    public double getTax(double price) {
       return price * .10;
    }
    
}
