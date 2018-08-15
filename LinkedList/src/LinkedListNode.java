public class LinkedListNode<T>{

    public T Value;
    public LinkedListNode Next;
    public LinkedListNode Previous;

    ///
    /// Конструктор нового узла со значением Value.
    ///
    public LinkedListNode(T value)
    {
        Value = value;
    }

    public LinkedListNode() {
    }


    ///
    /// Поле Value.
    ///
    public T getValue() {
        return  Value;
    }

    public void setValue(T value){
        Value = value;
    }
    ///
    /// Ссылка на следующий узел списка (если узел последний, то null).
    ///

    public LinkedListNode getNext() {
        return Next;
    }

    public void setNext(LinkedList next) {

        Next = next;

    }

    ///
    /// Ссылка на предыдущий узел списка (если узел первый, то null).
    ///

    public LinkedListNode getPrevious() {
        return Previous;
    }

    private void setPrevious(LinkedListNode previous) {
       Previous = previous;

    }
}
