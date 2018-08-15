import java.util.Iterator;

public class LinkedList<T> extends LinkedListNode
      implements Iterable {
     private LinkedListNode _head;
     private LinkedListNode _tail;
     public int count = 0;




    public LinkedList() {
        Value = null;
        Next = null;
        Previous = null;
    }
    public LinkedList(T value) {
        Value = value;
        Next = null;
        Previous = null;
        setCount(count++);
    }


    public void Add(T value)//* сложность O(1)
        {
            AddLast(value);

        }

    public void Clear()
    {
        _head = null;
        _tail = null;
        count = 0;
    }

    public boolean Contains(T item)//*Сложность 0(N)
    {
        LinkedListNode current = _head;
        while (current != null)
        {
            if (current.Value.equals(item))
            {
                return true;
            }

            current = current.Next;
        }

        return false;
    }

    public void CopyTo(T[] array, int arrayIndex)  //* Cложность О(N)
    {
        LinkedListNode current = _head;
        while (current != null)
        {
            array[arrayIndex++] = (T) current.Value;
            current = current.Next;
        }
    }



    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }


    public LinkedListNode get_head() {
        return _head;
    }

    public boolean IsReadOnly()
    {

        if (Value instanceof LinkedList)
            return true;
        else return false;
    }
    public void RemoveFirst()  //* Cложность О(1)
    {
        if (count != 0)
        {
            // До:    Head -> 3  5
            // После: Head -------> 5

            // Head -> 3 -> null
            // Head ------> null
            _head = _head.Next;

            count--;

            if (count == 0)
            {
                _tail = null;
            }
            else
            {
                // 5.Previous было 3; теперь null.
                _head.Previous = null;
            }
        }
    }
    public void RemoveLast()  //* Cложность О(1)
    {
        if (count != 0) {
            if (count == 1) {
                _head = null;
                _tail = null;
            } else {
                // До:    Head --> 3 --> 5 --> 7
                //        Tail = 7
                // После: Head --> 3 --> 5 --> null
                //        Tail = 5
                // Обнуляем 5.Next
                _tail.Previous.Next = null;
                _tail = _tail.Previous;
            }

            count--;
        }
    }

        public Boolean Remove(T item)
        {
            LinkedListNode previous = null;
            LinkedListNode current = _head;

            // 1: Пустой список: ничего не делать.
            // 2: Один элемент: установить Previous = null.
            // 3: Несколько элементов:
            //    a: Удаляемый элемент первый.
            //    b: Удаляемый элемент в середине или конце.

            while (current != null)
            {
                // Head -> 3 -> 5 -> 7 -> null
                // Head -> 3 ------> 7 -> null
                if (current.Value.equals(item))
                {
                    // Узел в середине или в конце.
                    if (previous != null)
                    {
                        // Случай 3b.
                        previous.Next = current.Next;

                        // Если в конце, то меняем _tail.
                        if (current.Next == null)
                        {
                            _tail = previous;
                        }
                        else
                        {
                            // До:    Head -> 3  5  7 -> null
                            // После: Head -> 3  7 -> null

                            // previous = 3
                            // current = 5
                            // current.Next = 7
                            // Значит... 7.Previous = 3
                            current.Next.Previous = previous;
                        }

                        count--;
                    }
                    else
                    {
                        // Случай 2 или 3a.
                        RemoveFirst();
                    }

                    return true;
                }

                previous = current;
                current = current.Next;
            }

            return false;
        }

    public void AddFirst(T value)
    {
        LinkedListNode node = new LinkedListNode(value);

        // Сохраняем ссылку на первый элемент.
        LinkedListNode temp = _head;

        // _head указывает на новый узел.
        _head = node;

        // Вставляем список позади первого элемента.
        _head.Next = temp;

        if (count == 0)
        {
            // Если список был пуст, то head and tail должны
            // указывать на новой узел.
            _tail = _head;
        }
        else
        {
            // До:    head -------> 5  7 -> null
            // После: head  -> 3  5  7 -> null
            temp.Previous = _head;
        }

        count++;
    }

    public void AddLast(T value)
    {
        LinkedListNode node = new LinkedListNode(value);

        if (count == 0)
        {
            this._head = node;
            setValue(node.Value);

        }
        else
        {

            this._tail.Next = node;


            // До:    Head -> 3  5 -> null
            // После:Head -> 3  5  7 -> null
            // 7.Previous = 5
            node.Previous = _tail;
        }

        _tail = node;
        count++;
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                if(Next != null)
                    return true;
                else return false;
            }

            @Override
            public Object next() {
                return Next;
            }
        };
    }


///todo create iterator system

}