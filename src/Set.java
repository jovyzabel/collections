import java.util.HashSet;
import java.util.TreeSet;

/* Video 25
    HashSet: pas de doublons, pas thread-safe, accès direct;

    TreeSet: pas de doublons, pas thread-safe, ordonnée, pas d'accès direct,
    reimplemente campare & campareTo

*/

public class Set {
    public Set(){
        System.out.println("--------------Collections sans Doublons------------");
    }

    public void show(){
        System.out.println("**********HashSet**************");
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(15);
        hs.add(-4);
        hs.add(388);

        hs.add(-4); // size won't increase because -4 already exists

        if (hs.contains(-4))
            hs.forEach(System.out::println);
        // clone and size of a hashSet
        hs.clone();
        System.out.println("hs has a clone : "+hs.clone().equals(hs)+", its capacity : "+ hs.size());

        System.out.println("**********TreeSet**************");
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Alphabet");
        ts.add("Basic");
        ts.add("Algebra");
        ts.add("Fundamental");

        ts.remove("Fundamental");

        if(!ts.contains("Fundamental"))
            ts.forEach(System.out::println);
        System.out.println(ts.getFirst());

    }
}
