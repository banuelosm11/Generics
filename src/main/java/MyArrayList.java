/**
 * Created by aurorabanuelos on 5/19/17.
 */
public class MyArrayList<T> {
    private T[] array;

    public MyArrayList(){}

    public MyArrayList(int size){
        array = (T[]) new Object[size];
    }

    public boolean add(T itemToAdd){
        return true;
    }

    public void add(int i, T itemToAdd){

    }

    public T get(int i){
        return null;
    }

    public T remove(int i){
        return null;
    }

    public T set(int i, T itemToSet){
        return null;
    }

    public void clear(){}

    public boolean isEmpty(){
        return true;
    }

    public boolean contains(Object obj){
        return true;
    }

    public int size(){
        return 0;
    }

}

