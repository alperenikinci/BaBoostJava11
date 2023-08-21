package com.bilgeadam.week08.lecture001.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMetotlari {

	public static void main(String[] args) {

		// Queue FIFO --> First in First out prensibiyle isler. Yani ilk gelen, ilk
		// cikar.

		Queue<Integer> queue = new LinkedList<>();
		// [ ] [- 1 -] [ ] [ ][- 2 - ] [-3-]

		queue.offer(2); // siraya bir elaman ekler.
		queue.add(2); // siraya bir eleman ekler.
		queue.peek(); // siradaki ilk ogeyi dondurur. Herhangi bir islem yapmaz.
		queue.poll(); // siradaki ilk ogeyi dondurur ve siradan cikarir.
		queue.isEmpty(); // sirada eleman kalip kalmadigini gosterir.
	}

}
