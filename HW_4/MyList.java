package HW_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list;
    private List<T> sortedList;
    private int len = 0;

    public MyList() {
        this.list = new ArrayList<>();
        this.sortedList = new ArrayList<>();
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
    public void printSortedList() {
        for (T t : this.sortedList) System.out.printf("%s  ", t.toString());
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
    
    public T sumItems() {
        if (this.list.isEmpty()) return null;
        if (list.get(0) instanceof Number) {
            Number sum = 0;
            for (T item : this.list) {
                sum = sum.doubleValue() + ((Number)item).doubleValue();
            }
            return (T)sum;
        }
        if (list.get(0) instanceof String) {
            StringBuilder sb = new StringBuilder();
            for (T item : this.list) {
                sb.append(item.toString());
            }
            return (T)sb.toString();
        }
        return null;
    }
    public T mulItems() {
        if (this.list.isEmpty()) return null;
        if (list.get(0) instanceof Number) {
            Number mul = 1;
            for (T item : this.list) {
                mul = mul.doubleValue() * ((Number)item).doubleValue();
            }
            return (T)mul;
        }
        return null;
    }

    public void bubbleSorting() {
        if (this.list.isEmpty()) return;
        sortedList.clear();
        sortedList.addAll(list);
        for (int i = 0; i < this.len - 1; i++) {
            for (int j = this.len - 1; j > i; j--) {
                if (sortedList.get(j-1).compareTo(sortedList.get(j)) > 0) {
                    T temp = sortedList.get(j-1);
                    sortedList.set(j-1, sortedList.get(j));
                    sortedList.set(j, temp);
                }
            }
        }
    }
    public void selectSorting() {
        if (this.list.isEmpty()) return;
        sortedList.clear();
        sortedList.addAll(list);
        for (int i = 0; i < this.len; i++) {
            int pos = i;
            T min = sortedList.get(i);
            for (int j = i + 1; j < this.len; j++) {
                if (sortedList.get(j).compareTo(min) < 0) {
                    pos = j;
                    min = sortedList.get(j);
                }
            }
            sortedList.set(pos, sortedList.get(i));
            sortedList.set(i, min);
        }
    }
    public void insertSorting() {
        if (this.list.isEmpty()) return;
        sortedList.clear();
        sortedList.addAll(list);
        int j;
        for (int i = 1; i < this.len; i++) {
            T temp = sortedList.get(i);
            for (j = i; 
                 j > 0 && temp.compareTo(sortedList.get(j-1)) < 0; 
                 j--) {
                sortedList.set(j, sortedList.get(j-1));
            }
            sortedList.set(j, temp);
        }
    }
}
