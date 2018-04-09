/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStack;

/**
 *
 * @author filip
 */
public interface Stack<T> {
    
    
     Stack<T> push(T item);
     
     T pop();
     
     T peek();

     boolean contains(T item);

     T access(T item) throws IllegalArgumentException;
      
     boolean isEmpty();
    
}
