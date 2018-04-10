/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicStack;
import java.lang.Iterable;
import java.util.*;

/**
 *
 * @author filip
 */
public class BasicStack<T> implements Stack<T>{
    
    private T container[];
    private int topItem;
    private final static int defaultSize = 10;
    
    public BasicStack(){
       this(defaultSize);
    }
    
    public BasicStack(int initialSize){
        container = (T[]) new Object[initialSize];
        topItem = -1;
    }
    
    @Override
    public BasicStack<T> push(T item){
        
        if(topItem == container.length -1){
            resize(container.length * 2);
        }
        
        container[++topItem] = item;
        
        return this;
    }
     
    @Override
    public T pop(){
         if(topItem == -1){
             return null;
         }
         
         T item = container[topItem];
         container[topItem--] = null;
         
         if(topItem > 0 && topItem == container.length / 4){
             resize(container.length/2);
         }
         return item;
     }
     
    @Override
     public T peek(){
           if(topItem == -1){
               return null;
           }
           return container[topItem];
     }
     
     public void resize(int newSize){
         T newContainer[] = (T[]) new Object[newSize];
         for(int i = 0; i <= topItem; i++){
             newContainer[i] = container[i];
         }
         container = newContainer;
     }

   @Override
    public boolean contains(T item){
        
         for(int i = 0; i < container.length; i++){
             if(container[i].equals(item)){
                 return true;
             }
             else {
                 return false;
             }
            
         }
         
        return false;
     }
    
    
    @Override
     public T access(T item){
         
         while(topItem > 0){
           T tempItem = pop();
             if(item.equals(tempItem)){
                 return tempItem;
             }
             
         }
        
         throw new IllegalArgumentException();
        
     }
      
    @Override
    public boolean isEmpty(){
        if(topItem == -1){
            return true;
        }
        
         return false;
     }
    
}

