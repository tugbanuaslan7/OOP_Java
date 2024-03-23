/** A person in a game */
public class Person {
  
  // the strength of the person
  private int strength;
  
  // the energy level of the person, it starts at a default value
  private int energy = 10;
  
  // the intelligence of the person
  private int intelligence;

  /** Create a person with the given strength and intelligence */
  public Person(int strength, int intelligence) {
    this.strength = strength;
    this.intelligence = intelligence;
  }
  
  /** Returns the strength of the person */
  public int getStrength() {
    return strength;
  }
  
  /** Changes the strength of the person */
  public void setStrength(int strength) {
    this.strength = strength;
  }
  
  /** Returns the energy of the person */
  public int getEnergy() {
    return energy;
  }
  
  /** Increases or decreases the energy of the person by amount */
  public void adjustEnergy(int amount) {
    this.energy = this.energy + amount;
  }
  
  /** Returns the intelligence of the person */
  public int getIntelligence() {
    return intelligence;
  }
  
  /** Changes the intelligence of the person */
  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }
  
  public void setItem(GameItem o){
    this.item = o;
  }
    
  public GameItem getItem(){
    return this.item;
  }
  
  public boolean pickup(GameItem o){
    if(o.getWeight() < this.o.getStrength()){
      setItem(o);
      return true;
    }
    return false;
  }
  
  public GameItem drop() {
    GameItem o = this.getItem();
    if (o == null) {
      return null;
    return o;
    }
  }  
  
  public void eat(Food f){
   this.adjustEnergy(f.getCalories());
   f.eat(this);
  } 

}
