public class GreeceInvoice extends Invoice{
    
    public GreeceInvoice() {
        taxableBehavior = new TenPercenTax();
    }
}
