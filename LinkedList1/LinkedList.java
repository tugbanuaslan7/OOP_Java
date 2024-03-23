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
  
  /**
   * Returns a String representation of the list
   * @return a String representing the list
   */
  public String toString() {
    StringBuilder result = new StringBuilder("list:");

    Node<T> current = head;
    while (current != null) {
        result.append(" ").append(current.getData());
        current = current.getNext();
    }

    return result.toString();
  }
  
  /**
   * Determines whether an element is stored in the list
   * @param element  the element to search for in the list
   * @return true if and only if the parameter element is in the list
   */
  public boolean contains(T element) {
    Node<T> current = head;
    while (current != null) {
        if (current.getElement().equals(element)) {
            return true; // Element found in the list
        }
        current = current.getNext();
    }
    return false;
  }
  
  /**
   * Deletes the first occurrance of an element in the list.
   * If the element is not in the list, the list is unchanged.
   * @param element  the element to remove
   */
  public void remove(T element) {
    if (head == null) {
        // Empty list, nothing to remove
        return;
    }

    if (head.getElement().equals(element)) {
        // Element to remove is at the head
        head = head.getNext();
        size--;
        return;
    }

    Node<T> current = head;
    Node<T> previous = null;

    while (current != null && !current.getElement().equals(element)) {
        previous = current;
        current = current.getNext();
    }

    if (current != null) {
        // Element found, remove the node
        previous.deleteNext();
        size--;
    }
  }
  
}
