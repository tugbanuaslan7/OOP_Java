## Strategy Pattern

Assume you have an
e-commerce application and you are selling items worldwide. Your application should
compute sales tax for different countries. Different countries might have different tax
policies. For example, suppose that while in Turkiye, we have 20% VAT and Poland has
15% and many other countries have different rates for sales tax.

### 3.1. Item Class

Create an item class that stores two fields: name and the price. Type of the name is
String and the type for price is double for your convenience. Provide means to retrieve
and update these fields.

### 3.2. Invoice Class

Create an abstract class called "Invoice". You will have a field called “purchasedItems”,
which is an `ArrayList<Item>`. Items purchased by the customer will be stored in this list.
Then, define another field called total of type double for the total amount. Create a
method called “addAnItem” that accepts an Item and adds the item to your
“purchasedItems” list. Then, create another method called getTotal that traverses all
the purchased items and updates the “total”. However, calculating the total requires you
to know the tax of the specific country. You should have another method called
calculateTax that calculates the tax in this abstract class. Before starting the
calculateTax method, think about our lecture on the strategy pattern: In our discussion
about the strategy pattern in the lecture, we said that programming to implementation is
not a good idea. If we implement a default sales tax (such as 20%) in the calculateTax
method here, any class such as TurkiyeInvoce, USAInvoice, PolandInvoice, etc. (we will
see them in 3.4) deriving from the Invoice class should override the calculateTax
method if the default strategy does not fit for them. Even tax policies are subject to
change in countries. For example, Poland should decide to change the sales tax to 25%.
You know that change is constant. Instead, we should define our strategies. So, stop
here for now and skip to 3.3 for the strategies. Then, come back to continue.

Now, you should have completed 3.3. It is time to define a field (behavior) called
taxBehavior of type TaxBehavior and add a method to update the behavior in runtime.
Now, start coding the calculateTax method and make a call to your taxBehavior field’s
getTax method to calculate the tax. By doing so, any class deriving from the Invoice
class can calculate its own tax without relying on the calculateTax method of the Invoice
class.


### 3.3. Strategies

Create an interface called TaxableBehavior and include a method called getTax that
accepts a variable called price of type double.

For this strategy, define different concrete classes that implement the Taxable interface
for different rates of sales tax. Create classes called FivePercentTax, TenPercentTax,
EighteenPercentTax and TwentyPercentTax that calculate the corresponding sales tax
amount for the given price.


### 3.4. Subclasses of the Invoice for different countries

Now, we will create our subclasses of the Invoice class. For now, we will create four
different subclasses of the Invoice for Turkiye, USA, Poland, and Greece. These
classes are the concrete classes and should only include a constructor that initializes
their tax behavior. TurkeyInvoice, USAInvoice, PolandInvoice, and GreeceInvoice
classes should have 18%, 5%, 20%, and 10% sales tax, respectively.