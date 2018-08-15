import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    private static void PrintList(LinkedListNode node)
    {
        while (node != null)
        {
            System.out.println(node.Value);
            node = node.Next;
        }
    }



    public static void main(String[] args) {


       /* LinkedListNode first = new LinkedList(3);

        LinkedListNode middle = new LinkedList (5);

        first.Next = middle;

        LinkedListNode last = new LinkedList(7);


        middle.Next = last;
      PrintList(first);*/

        LinkedList<Integer> linkedList = new LinkedList<>(3);

        linkedList.Add(5);
        linkedList.Add(6);

        linkedList.getNext();


        Iterator<String> iter = linkedList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


       /*while (linkedList.hasNext()){
           System.out.println(linkedList.next());
       }

       System.out.println(linkedList.next());*/
    }
}
