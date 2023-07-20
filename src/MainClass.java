import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        CustomLinkedList<Integer> array =new CustomLinkedList<>();
        // Создал пустой LinkedList для проверки если лист пустойб как отрабатывает программа
        CustomLinkedList<Integer> array1 =new CustomLinkedList<>();
        array.add(4);
        array.add(7);
        array.add(18);
        array.add(32);

        array.delete(3);
        array.addFirst(8);

        for (int i=0; i< array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println(array.getFirst());
        System.out.println(array.getLast());
//List<Integer> array1 = new LinkedList<>();
//List<Integer> array2 = new ArrayList<>();
//
//for (int i=0 ; i < 10000000; i++) {
//    array2.add(i);
//    array1.add(i);
//}
//
//long before = System.currentTimeMillis();
//for (int i = 200; i < 350; i++) {
//    array2.add(i, i+1);
//}
//long after = System.currentTimeMillis();
//System.out.println(after-before);

    }
}
