package list;

import java.util.Stack;

public class MinhaFilaComPilha implements FilaComPilha {
    private Stack<Integer> pilhadeentrada; 
    private Stack<Integer> pilhadesaida;

    public void enqueue(int item) {
        pilhadeentrada.push(item);
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        if (pilhadesaida.isEmpty()) {
            transferirParaPilhadesaida();
        }
        return pilhadesaida.pop();
    }
    public boolean isEmpty() {
        return pilhadeentrada.isEmpty() && pilhadesaida.isEmpty();
    }
    public int size() {
        return pilhadeentrada.size() + pilhadesaida.size();
    }
    private void transferirParaPilhadesaida() {
        while (!pilhadeentrada.isEmpty()) {
            pilhadesaida.push(pilhadeentrada.pop());
        }
}
}
