/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Administrador
 */
public class Owner {
    public String ToString;
    private String name;
    private int id;
    private boolean afiliated;
    
    public Owner(String name, int id, boolean afiliated){
        this.name=name;
        this.id=id;
        this.afiliated=afiliated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAfiliated() {
        return afiliated;
    }

    public void setAfiliated(boolean afiliated) {
        this.afiliated = afiliated;
    }
    
    @Override
    public String toString(){
           return "ID:"+id+"Is afiliated?:"+afiliated;
    }
    
}
