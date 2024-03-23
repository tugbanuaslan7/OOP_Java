public abstract class Food extends GameItem {
  
  int calories;
  
  public Food(String name, double weight, int calories){
    super(name, weight);
    this.calories = calories;
  }
  
  public int getCalories(){
    return calories;
  } 
  
  public void eat(Person p){
  }
  
}
