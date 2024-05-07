package list;

import java.util.EmptyStackException;
import java.util.Stack;

public class MinhaPilha implements Pilha{
    private Stack<Integer> pilha;

    public MinhaPilha() {
        pilha = new Stack<>();
    }

    
    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    
    public void push(int item) {
        pilha.push(item);
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.pop();
    }
}
