/**
 * A class to represent a linked list of nodes.
 */
public class LinkedList<T> {
  /** the first node of the list, or null if the list is empty */
  private LLNode<T> firstNode;
  
  /**
   * Creates an initially empty linked list
   */
  public LinkedList() {
    firstNode = null;
  }
  
  /**
   * Returns the first node.
   */
  protected LLNode<T> getFirstNode() {
    return firstNode;
  }

  /**
   * Changes the front node.
   * @param node  the node that will be the first node of the new linked list
   */
  protected void setFirstNode(LLNode<T> node) {
    this.firstNode = node;
  }

  /**
   * Add an element to the front of the linked list
   */
  public void addToFront(T element) {
    setFirstNode(new LLNode<T>(element, getFirstNode()));
  }
  
  /**
   * Return whether the list is empty
   * @return true if the list is empty
   */
  public boolean isEmpty() {
    return (getFirstNode() == null);
  }
  
  /**
   * Returns the length of the linked list
   * @return the number of nodes in the list
   */
  public int length() {
    int lengthSoFar = 0;
    LLNode<T> nodeptr = getFirstNode();
    while (nodeptr != null) {
      lengthSoFar++;
      nodeptr = nodeptr.getNext();
    }
    return lengthSoFar;
  }
  
  /*-------------------------------------------*/
  /* THE NEXT METHODS WILL BE COMPLETED IN LAB */
  /*-------------------------------------------*/
  
  /**
   * Returns a String representation of the list
   * @return a String representing the list
   */
  public String toString() {
    return null;
  }
  

  public void deleteFirst(){
    if(isEmpty()){
      throw new NoSuchElementException("List is empty.");
    }
    firstNode = firstNode.getNext();
  }

  public void deleteLast() {
    if (isEmpty()) {
        throw new NoSuchElementException("List is empty.");
    }

    LLNode<T> current = firstNode;
    LLNode<T> prev = null;

    while (current.getNext() != null){
      prev = current;
      current = current.getNext();
    }

    if (prev == null) {
        firstNode = null;
    }
    else {
        prev.setNext(null);
    }
  }

  public void remove(T element) throws NoSuchElementException{
    if (isEmpty()) {
      throw new NoSuchElementException ("List is empty.")
    }

    LLNode<T> current = firstNode;
    LLNode<T> prev = null;

    while (current != null && !current.getElement().equals(element)){
      prev = current;
      current = current.getNext();
    }

    if (current != null) {
      if (prev == null) {
        firstNode = current.getNext();
      }
      else {
        prev.setNext(current.getNext());
      }
    }

  }

  
}
