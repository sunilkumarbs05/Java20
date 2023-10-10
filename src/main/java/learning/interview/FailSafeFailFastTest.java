package learning.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFastTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        for (Integer integer : list) {
            System.out.println(integer);
//            list.add(50);   // ConcurrentModificationException --> Fail fast
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
           iterator.remove();
        }

        System.out.println(" After iterator -----------------------------");
        System.out.println(list);


        CopyOnWriteArrayList<Integer> copyOnWriteArrayList  = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(20);
        copyOnWriteArrayList.add(30);
        for (Integer integer : copyOnWriteArrayList) {
              copyOnWriteArrayList.add(100);
        }

        System.out.println(copyOnWriteArrayList);
    }
}
