import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.clear();
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.delite(1);
        System.out.println(myArrayList.containsElements(5));
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(2));

    }

}