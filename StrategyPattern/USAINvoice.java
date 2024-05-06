public class USAINvoice extends Invoice{
    
    public USAINvoice() {
        taxableBehavior = new FivePercentTax();
    }
    
}
