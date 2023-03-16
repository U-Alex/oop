package HW_4;

public class Main {
    public static void main(String[] args) {

        MyList<String> list1 = new MyList<String>(new String[]{"8", "10", "9", "fall", "1"});
        MyList<Integer> list2 = new MyList<Integer>(new Integer[]{8, 10, 9, 0, -2, 200});
        MyList<Double> list3 = new MyList<Double>(new Double[]{8., 10., 9., 4., -10.});

        //System.out.println(list1.mulItems());
        //System.out.println(list2.mulItems());
        //System.out.println(list3.mulItems());
        list1.bubbleSorting();
        list2.selectSorting();
        list3.insertSorting();

        list1.printList();
        list1.printSortedList();
        list2.printList();
        list2.printSortedList();
        list3.printList();
        list3.printSortedList();
        

    }
}
