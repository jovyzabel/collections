
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.ListIterator;
import java.util.Collections;
/*
Video 23:
    ArrayList: mono-thread, accès direct, optimisée pour la lecture
    LinkedList: insertions rapides
    Vector: multi-thread, accès direct, optimisée pour la lecture
    Stack: LIFO, multi-thread
 */

public class Liste {
    public Liste(){
        System.out.println("**************COLLECTIONS****************");
    }
    public void show(){
        System.out.println("------ArrayList------");

        ArrayList<String> content = new ArrayList<String>();
        String c1 = "Dog";
        String c2 = "Cat";
        String c3 = "Rooster";
        String c4 = "Horse";
        String c5 = "Ant";

        content.add(c1);
        content.add(c2);
        content.add(c3);
        content.add(c4);
        content.add(c5);

        for(String c : content)
            System.out.print(c+"\t");

        System.out.println("\n"+"Capacity before removing :"+content.size());
        content.removeLast();
        System.out.println("New last element "+content.getLast());
        System.out.println("Capacity after removing :"+content.size());

        System.out.println("--------Vector--------");

        Vector<Integer> nums = new Vector<Integer>();
        nums.add(302);
        nums.add(10);
        nums.addFirst(20);
        Collections.sort(nums);

        nums.forEach(System.out::println);

        System.out.println("--------LinkedList---------");

        LinkedList<Double> lists = new LinkedList<Double>();
        lists.add(30.2);
        lists.add(100.0);
        lists.addLast(2.50);

        lists.sort(Double::compareTo);
        ListIterator<Double> list = lists.listIterator();

        while(list.hasNext())
            System.out.println(list.next());

        System.out.println("--------Stack---------");

        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.add("Gorille");
        animals.addLast("Elephant");
        animals.push("Phoenix");

        //iterator
        ListIterator<String> animal = animals.listIterator();

        while (animal.hasNext())
            System.out.println(animal.next());

        animals.pop();


    }
}
