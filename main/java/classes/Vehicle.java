/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Angélica C
 */
public class Vehicle implements Comparable<Vehicle> {
    private String Vrp;
    private String brand;
    private Owner Owner;
    
    public Vehicle(String vrp, String brand){
        this.Vrp= Vrp;
        this.brand= brand;
    }
    
    public String getVrp(){
        return Vrp;
    }
    
    public void setVrp(String Vrp){
        this.Vrp= Vrp;
        
    }
    
    public String getbrand(){
        return brand;
    }
    
    public String setbrand(String brand){
        this.brand= brand;
        return brand;
    }

    @Override
    public int compareTo(Vehicle o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Owner getOwner() {
        return Owner;
    }

    public void setOwner(Owner Owner) {
        this.Owner = Owner;
    }
    
}
