public class Steak extends Food {
  
 public Steak() {
   super("Steak", 0.3, 30);
 }

@Override
public void eat(Person p) {
  p.setStrength(p.getStrength() + 1);
}
  
  
}
