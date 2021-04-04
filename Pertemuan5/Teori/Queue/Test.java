import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        methodQueue test = new methodQueue();
        test.output();
    }
}

class MainQueue {
    Queue<Integer> myQueue = new LinkedList<Integer>();

    public void ElementsQueue() {
        for (int i = 0; i < 10; i++)
            myQueue.add(i);
        System.out.println("Elements of queue " + myQueue);
    }
}

class methodQueue extends MainQueue {

    void delete() {
        int hapus = myQueue.remove();
        System.out.println("Element yang dihapus= " + hapus);
        System.out.println(myQueue);
    }

    // REMOVE HEAD ELEMENTS
    void change() {
        int merubah = myQueue.poll();
        myQueue.offer(10);
        System.out.println("head Elements of queue now: " + merubah);
    }

    // ANGKA QUEUE DEPAN
    void AngkaDepan() {
        int depan = myQueue.peek();
        System.out.println("Elements of queue now " + myQueue);
        System.out.println("head Elements of queue now = " + depan);
    }

    // PANJANG SEBUAH QUEUE
    void panjangList() {
        int size = myQueue.size();
        System.out.println("Panjang element queue= " + size);
    }

    void output() {
        super.ElementsQueue();
        delete();
        change();
        AngkaDepan();
        panjangList();
    }
}
