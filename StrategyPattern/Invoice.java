import java.util.ArrayList;


public abstract class Invoice {
    
    private ArrayList<Item> purchasedItems;
    TaxableBehavior taxableBehavior;
    private double total;

    public Invoice() {
        purchasedItems = new ArrayList<Item>();
        total = 0;
    }

    public void setTaxableBehavior(TaxableBehavior tb){
        this.taxableBehavior = tb;
    }

    public void addAnItem(Item item){   
        purchasedItems.add(item);
    }

    public double getTotal(){
        total = 0;
        for (Item item : purchasedItems) {
            total += item.getPrice() + calculateTax(item);
        }
        return total;
    }

    public double calculateTax(Item item){
        return taxableBehavior.getTax(item.getPrice());
    }


}
