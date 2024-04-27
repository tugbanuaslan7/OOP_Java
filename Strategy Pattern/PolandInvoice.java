public class PolandInvoice extends Invoice{
    
    public PolandInvoice() {
        taxableBehavior = new TwentyPercentTax();
    }
}
