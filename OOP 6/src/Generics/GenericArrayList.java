package Generics;

import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public GenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }


    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    public void resize(){
        Object[] temp=new Object[data.length*2];
        for(int i=0; i< data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        GenericArrayList<Integer> list = new GenericArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
    }
}
