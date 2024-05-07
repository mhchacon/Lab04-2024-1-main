package list;

import java.util.LinkedList;

public class MinhaFila implements Fila {
    private LinkedList<Integer> fila;
    
    public MinhaFila(){
        fila = new LinkedList<>();
    }
    public void enqueue(int item){
        fila.add(item);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Fila esta vazia");
        }
        return fila.removeFirst();
    }
    public boolean isEmpty() {
        return fila.isEmpty();
    }
    public int size() {
        return fila.size();
    }
}
