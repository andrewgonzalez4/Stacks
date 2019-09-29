package UPRM.EDU.ICOM4035;

public class ArrayStack<E> implements Stack<E>{

    private E[] elements;
    private int currentSize;
    private static final int DEFAULT_SIZE = 10;

    public ArrayStack(int initialSize){

        if(initialSize < 1){
            throw new IllegalArgumentException();
        }
        this.elements = (E[])new Object[initialSize];
        this.currentSize = 0;
    }

    public ArrayStack(){
        this(DEFAULT_SIZE);
    }

    public int size(){
        return this.currentSize;
    }

    public void reAllocate(){
        E[] temp = (E[]) new Object[2*this.currentSize];
        for (int i=0; i < this.currentSize; ++i) {
            temp[i] = this.elements[i];
        }
        this.elements = temp;
    }

    @Override
    public void push(E e) {
        if(this.currentSize == this.elements.length){
            this.reAllocate();
        }
        this.elements[currentSize++] = e;
    }

    @Override
    public E pop() {
        E result = this.elements[currentSize-1];
        this.elements[currentSize - 1] = null;
        this.currentSize--;
        return result;
    }

    @Override
    public E peek() {
       return this.elements[currentSize - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = null;
        }
        this.currentSize =0;
    }
}
