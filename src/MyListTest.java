
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>(5);
        myList.add(1);
        myList.add(9);
        myList.add(45);
        myList.add(27);

        myList.display();

        myList.add(3,10);
        myList.add(3,12);
        myList.display();

        myList.remove(5);
        myList.display();
        System.out.println(myList.getSize());
        System.out.println(myList.isContain(12));
        System.out.println(myList.indexOf(12));
        myList.ensureCapacity(10);
        myList.ensureCapacity(5);
        System.out.println(myList.get(3));
        System.out.println(myList.get(10));
        myList.clear();
        myList.display();




    }
}
