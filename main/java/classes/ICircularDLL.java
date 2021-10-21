/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Administrador
 * @param <T>
 */
public interface ICircularDLL <T> {
    public void add(T Object);
    
    public void clear();
    
    public int getTicket();
    public String getInfo();
    
}
