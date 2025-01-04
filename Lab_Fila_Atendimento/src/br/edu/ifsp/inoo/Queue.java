package br.edu.ifsp.inoo;

public abstract class Queue {

	protected abstract boolean enqueue(Client client);
	
	protected abstract Client dequeue();
	
	protected abstract boolean isFull();
	
	protected abstract boolean isEmpty();
	
}
