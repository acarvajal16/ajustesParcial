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
    
}

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public CircularDLL<Vehicle> getCircularParking() {
        return OriginalParkingLot;
    }

    public void setCircularParking(CircularDLL<Vehicle> circularParking) {
        this.OriginalParkingLot = OriginalParkingLot;
    }
    
}
