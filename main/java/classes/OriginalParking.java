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
public class OriginalParking {
    
   
    private Node current = null;
    private CircularDLL<Vehicle> OriginalParkingLot;
    
    
    public CircularDLL<Vehicle> getOriginalParkingLot(){
        return OriginalParkingLot;
    }
    
    public void setOriginalParkingLot(CircularDLL<Vehicle> OriginalParkingLot){
        this.OriginalParkingLot= OriginalParkingLot;
    }
    
    



    public OriginalParking() {

        OriginalParkingLot = new CircularDLL();
        for(int i = 0; i<=10; i++){
            OriginalParkingLot.add(null);
        }
    }

    public void addVehicle(Vehicle Vehicle){

        //   il = contador izquierda(left)
        int il = 0;
        int ir = 0;

        if(current == null){
            OriginalParkingLot.setFirst(current);
        }
        while(il <= 5 && ir <= 5){


    }
        
    public void deleteId(int id){
        
        Node deleteOwner= OriginalParkingLot.getFirst();
        int deleteO= id;
        
        for(int i=0; i<=10; i++){
            Vehicle vehicle= (Vehicle) deleteOwner.getValue();
            Owner owner= vehicle.getOwner();
            
            if(owner.getId()== deleteO){
                deleteOwner.setValue(null);
                current= deleteOwner;
                return;
            }
            
            deleteOwner= deleteOwner.getNext();
          
        }
        System.out.println("Id not found");
        
    } 
    
    public void deleteByVrp(String vrp){
         Node clearA= OriginalParkingLot.getFirst();
         String delete= Vrp;
         
         for (int i=0; i<=10; i++){
             Vehicle vehicle= (Vehicle) clearA.getValue();
             
             if(vehicle.getVrp().equals(delete)){
                 clearA.setValue(null);
                 current= clearA;
                 return;
             }
             
             clearA= clearA.getNext();
         }
         
         System.out.println("Vehicle not found");
     }
     
}

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    
    
}
