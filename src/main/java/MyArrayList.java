/**
 * Created by aurorabanuelos on 5/19/17.
 */
public class MyArrayList<T> {
    private T[] array;

    public MyArrayList(){
        array = (T[]) new Object[0];
    }

    public MyArrayList(int size){
        array = (T[]) new Object[size];
    }

    public boolean add(T itemToAdd){
        T[] newArray = (T[]) new Object[array.length+1];

        for(int i =0; i < array.length; i++){
            newArray[i] = array [i];
        }

        newArray[array.length] = itemToAdd;
        array = newArray;

        if(array[array.length -1] == itemToAdd){
            return true;
        }
        return false;
    }

    public void add(int i, T itemToAdd){
        T[] newArray = (T[]) new Object[array.length+1];

        for(int j =0; j < i; j++){
            newArray[j] = array [j];
        }

        newArray[i] = itemToAdd;

        for(int k = i+1; k < array.length+1; k++){
            newArray[k] = array[k-1];
        }

        array = newArray;
    }

    public T get(int i){
        return array[i];
    }

    public T remove(int i){

        T[] newArray = (T[]) new Object[array.length-1];

        for(int j =0; j < i; j++){
            newArray[j] = array [j];
        }

        T elementRemoved = array[i];

        for(int k = i; k < array.length-1; k++){
            newArray[k] = array[k+1];
        }

        array = newArray;
        return elementRemoved;
    }

    public T set(int i, T itemToSet){

        array[i] = itemToSet;

        return array[i];
    }

    public void clear(){
        T[] newArray = (T[]) new Object[0];
        array = newArray;
    }

    public boolean isEmpty(){
        if(array.length > 0) {
            return false;
        }
        return true;
    }

    public boolean contains(Object obj){
        for(int i = 0; i < array.length; i++) {
            if (obj.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public int size(){
        return array.length;
    }

}

