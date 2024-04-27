public class TurkeyInvoice extends Invoice{
    
    public TurkeyInvoice() {
        taxableBehavior = new EigtheenPercentTax();
    }
}
