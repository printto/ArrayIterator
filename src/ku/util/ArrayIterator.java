package ku.util;

/**
 * This program provides an Iterator for any array.
 * @author Pappim Pipatkasrira
 * @version 5.01.2017
 * @since 5.01.2017
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T>  {
	/** attribute for the array we want to iterate over */
	private T[] array;
	int count = 0;
	/**
	 * Initialize a new array iterator with the array to process.
	 * @param array is the array to iterate over
	 */
	public ArrayIterator(T[] array) {
		this.array = array;
		//TODO: initialize any other variables you need
	}
	/**
	 * Return the next non-null element from array, if any.
	 * @return the next non-null element in the array.
	 * @throws NoSuchElementException if there are no more elements
	 *        to return.
	 */
	public T next() {
		if(hasNext()){
			return array[count++];
		}
		else{
			throw new NoSuchElementException();
		}
	}
	
	@Override
	public boolean hasNext() {
		for(int i = count ; i < array.length ; i++){
			if(array[i] != null){
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	public void remove(){
		
	}
}
