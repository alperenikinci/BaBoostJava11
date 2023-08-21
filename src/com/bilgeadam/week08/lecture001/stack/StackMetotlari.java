package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class StackMetotlari {

	public static void main(String[] args) {
		// Stack ->>> LIFO ->> Last in first out
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1); // 1 sayisini stack'e ekler.
		stack.push(2); // 2 sayisini stack'e ekler. Genellikle stacklerde ekleme islemi icin push
						// kullanilir.
		stack.peek(); // Stack'e en son eklenen degeri, stack'ten cikarmadan getirir.
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();

		stack.pop(); // Stack'e en son eklenen degeri getirir ve stack'ten cikarir.
		System.out.println(stack.pop());
		System.out.println(stack);

//		stack.pop(); Stack'te eleman kalmamis iken, bu metot tekrar calistirilirsa EmptyStackException aliriz.

		// is, has,
		stack.isEmpty(); //Stack'te eleman olup olmadigini kontrol eder. Eger hic eleman yoksa true, eleman var ise false doner.
		System.out.println(stack.isEmpty());

	}

}
