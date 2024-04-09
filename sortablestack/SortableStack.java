// Tuğba Nur Aslan 210101030

import java.util.NoSuchElementException;

public class SortableStack<T extends Comparable<T>>{

    // Field
    private StackNode<T> top;  // the top element in the stack

    // Constructor
    // Creates an initially empty stack
    public SortableStack() {
        this.top = null;  // there is no element in the stack initially
    }

    // Returns the length of the stack
    public int length(){
        int count = 0;
        StackNode<T> nodePtr = top;
        while(nodePtr != null){
            nodePtr = nodePtr.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    // Adds a new element to the top of the stack.
    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data); // Create a new element
    
        if (isEmpty()) {
            // If the stack is empty, set the new element as the top directly
            top = newNode;
        } else {
            // If the stack is not empty, set the next connection of the new element to the current top
            newNode.setNext(top);
            top = newNode;    // Update the top to the new element
        }
    }
    
    // Removes and returns the element at the top of the stack
    public T pop() throws NoSuchElementException {
      if (isEmpty()) {
        throw new NoSuchElementException();
      }
      else {
        T save = top.getData();  // If the stack is not empty, save the data of the top element
        top = top.getNext();     // Move the next node to the top
        return save;             // Return the data of the top element
      }
    }

    // Retrieves the element at the top of the stack without removing it.
    public T peek() throws NoSuchElementException {
        if (isEmpty()) {
          throw new NoSuchElementException();
        }
        else {
          return top.getData();     // Return the top element of the stack
        }
      
    }

    // Method to sort the stack
    public void sort() {
        int size = length();
        
        if (isEmpty()) {
            // If the stack is empty no need to sort
            return;
        }
    
        while (size > 0) {
            int i = 0;
            StackNode<T> nodePtr = top;     // Hold the first element in the stack
            StackNode<T> nextNode = nodePtr.getNext();   // Update to move to the next element
    
            while (i < size - 1) {
                // If the current element is greater than the next one
                if ((nodePtr.getData()).compareTo(nextNode.getData()) > 0) {
                    // Swap data of nodePtr and nextNode
                    T temp = nodePtr.getData();
                    nodePtr.setData(nextNode.getData());
                    nextNode.setData(temp);
                }
                // Move to next element
                nodePtr = nextNode;
                nextNode = nodePtr.getNext();
                i++;
            } 

            size--;
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        StackNode<T> nodePtr = top;
        while (nodePtr != null) {
            result += nodePtr.getData();
            if (nodePtr.getNext() != null) {
                result += " ";
            }
            nodePtr = nodePtr.getNext();
        }
        result += " ";
        return result;
    }


    // A nested class (static) for the nodes of the linked list
    public static class StackNode<T> {
        private T data;
        private StackNode<T> nextNode;

        // Constructor
        public StackNode(T data) {
            this.data = data;
            this.nextNode = null;
        }
        
        // Returns the data stored in the node
        public T getData() {
            return data;
        }
        
        // Changes the data stored in the node
        public void setData(T data) {
            this.data = data;
        }

        // Returns the next node of the list
        public StackNode<T> getNext() {
            return nextNode;
        }
        
        // Changes the node that comes after this node in the list
        public void setNext(StackNode<T> next) {
            this.nextNode = next;
        }
      }


}

  
