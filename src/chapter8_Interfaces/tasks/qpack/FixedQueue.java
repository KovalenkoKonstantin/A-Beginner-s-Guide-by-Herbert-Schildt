package chapter8_Interfaces.tasks.qpack;

// A fixed-size queue class for characters.
public class FixedQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {//при объявлении конструктора ему долен быть передан
// параметр характеризующий размер массива
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;//установить начальную позицию по умолчанию на 0 индекс
    }

   @Override
    // Put a characer into the queue.
    public void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
        }
//значение переданное в качестве параметра методу присваивается позиции putloc+1
        else q[putloc++] = ch;
    }

    @Override
    // Get a character from the queue.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;//приведение типов
        }
        else return q[getloc++];
    }
}
