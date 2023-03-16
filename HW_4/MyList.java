package HW_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list;
    private int len = 0;

    public MyList() {
        this.list = new ArrayList<>();
    }
    public MyList(T[] args) {
        this();
        for (T arg : args) {
            this.list.add(arg);
        }
        this.len = this.list.size();
    }

    public void printList() {
        for (T t : this.list) System.out.printf("%s  ", t.toString());
                              System.out.println();
    }
    public Integer getSize() {
        return this.len;
    }

    public void addItem(T elem) {
        this.list.add(elem);
        this.len = this.list.size();
    }
    public T remItem(int idx) {
        if (idx < 0 || idx >= this.len) return null;
        T temp = this.list.remove(idx);
        this.len = this.list.size();
        return temp;
    }
    public void remValues(T elem) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(elem)) it.remove();
        }
        this.len = this.list.size();
    }

    public T getItem(int idx) {
        if (idx < 0 || idx >= this.len) return null;
        return list.get(idx);
    }

    public Integer getIndex(T elem) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(elem)) return i;
        }
        return -1;
    }

    public boolean exist(T elem) {
        return list.contains(elem);
    }

    public boolean setItem(int idx, T elem) {
        if (idx < 0 || idx >= this.len) return false;
        list.set(idx, elem);
        return true;
    }

    public T minItem() {
        if (this.list.isEmpty()) return null;
        T min = list.get(0);
        for (T item : this.list) {
            if (item.compareTo(min) < 0) min = item;
        }
        return min;
    }
    public T maxItem() {
        if (this.list.isEmpty()) return null;
        T max = list.get(0);
        for (T item : this.list) {
            if (item.compareTo(max) > 0) max = item;
        }
        return max;
    }
    /*
    public T sumItems() {
        if (this.list.isEmpty()) return null;
        T sum = list.get(0);
        for (T item : this.list) {
            sum += item;
        }
        return sum;

    }*/


}
