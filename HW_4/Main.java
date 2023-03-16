package HW_4;

public class Main {
    public static void main(String[] args) {

        MyList<String> list1 = new MyList<String>(new String[]{"8", "10", "9", "fall", "1"});
        MyList<Integer> list2 = new MyList<Integer>(new Integer[]{8, 10, 9, 0, -2, 200});
        MyList<Double> list3 = new MyList<Double>(new Double[]{8., 10., 9., 4., -10.});

        //System.out.println(list1.sumItems());
        //System.out.println(list2.exist(10));
        //System.out.println(list3.sumItems());

        list1.printList();
        list2.printList();
        list3.printList();
        

    }
}
