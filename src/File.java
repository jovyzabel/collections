import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
/*
    PriorityQueue :  Ordonnée, accepte les doublons, refuse les valeurs nulles, non thread-safe;
    ArrayDequeue :  Ordonnée, accepte les doublons, refuse les valeurs nulles, non thread-safe;
 */
public class File {
    public File(){
        System.out.println("--------------FILE-DE-DONNÉES------------");
    }

    public void showQueue (){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        try{
            pq.add(8);
            pq.add(4);
            pq.add(60);
            pq.add(-8);
            pq.add(33);
            Iterator<Integer> it = pq.iterator();

            System.out.println("peek : "+pq.peek()+"\n");

            while(it.hasNext())
                System.out.println(it.next());
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
    public void showDequeue (){
        ArrayDeque<String> ad = new ArrayDeque<String>();
        try{
            ad.addFirst("8");
            ad.offerFirst("4");
            ad.addLast("60");
            ad.addLast("null");
            ad.addFirst("-8");
            ad.addLast("33");

            System.out.println("last peek : "+ ad.peekLast());
            Iterator<String> it = ad.iterator();

            while(it.hasNext())
                System.out.println(it.next());
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

}
