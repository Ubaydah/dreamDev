package dsa;

public class Stack {
    private int count = 0;
    private String element;

    public boolean isEmpty() {
      return count == 0;
    }

    public void push(String element) {
        count++;
        this.element = element;
    }

    public String pop() {
        count--;
        return element;
    }
}
