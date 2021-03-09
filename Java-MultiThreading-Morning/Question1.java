
import java.util.LinkedList;
import java.util.Queue;

class Items {
	Queue<Integer> q = new LinkedList<>();

	public Items() {
		for (int i = 1; i < 10; i++)
			q.add(i);
	}

	synchronized void put(int num) {
		if (q.size() == 5) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Produces : " + num);
		q.add(num);
		System.out.println("Size of Queue : " + q.size());
		notify();
	}

	synchronized void get() {
		if (q.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int removed = q.remove();
		System.out.println("Consumes : " + removed);
		System.out.println("Size of Queue : " + q.size());
		notify();
	}

}

class Producer implements Runnable {
	Items I;

	public Producer(Items obj) {
		this.I = obj;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 5;
		while (true) {
			I.put(++i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Consumer implements Runnable {
	Items I;

	public Consumer(Items obj) {
		this.I = obj;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		while (true) {
			I.get();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class Main {

	public static void main(String[] args) {
		Items obj = new Items();
		new Producer(obj);
		new Consumer(obj);

	}

}
