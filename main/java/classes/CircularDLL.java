/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static java.util.Collections.list;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author Administrador
 * @param <T>
 */
public class CircularDLL <T extends Comparable <T>> implements ICircularDLL <T> {
    
    private Node first;
    private Node last;
    private Node current;

    @Override
    public void add(T Object) {
        Node<T> current= new Node<T>(Object);
        
        if (first==null){
            first=current;
            last=first;
        }else{
            last.setNext(current);
            current.setPrevious(last);
            last= current;
            last.setNext(first);
            first.setPrevious(last);
        }
    }
    public Node getFirst(){
        return first;
    }
    
    public void setFirst(Node first){
        this.first= first;
    }
    
    public Node getLast(){
        return last;
    }
    
    public void setLast(Node last){
        this.last= last;
    }
    
    public Node getCurrent(){
        return current;
    }
    
    public void setCurrent(){
        this.current=current;
    }

    

    @Override
    public void clear() {
        first= null;
        last= null;
        
    }

    

    @Override
    public int getTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInfo() {
        Node current= first;
        
        String ans= "";
        
        
        for(int i=0; i<10;i++){
            System.out.println(current.getValue());
            current= current.getNext();
        }
        
        do{
            ans +=current.getInfo() + "\n";
            current= current.getNext();
        }while(current!=first);
        return ans;
        
    }

    

    
    
    
}
