/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author MS-USER
 */
public class CarRent {
    //berisi objek car rider
    private CarRider rider;
    
    //berisi objek car
    private Car car;
    private int rentDur;
    
    //konstruktor dengan parameter
    public CarRent (CarRider rider, Car car, int rentDur){
        //inisiasi
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }
    
    //setter getter
    public CarRider getRider(){
        return rider;
    }
    
    public Car getCar(){
        return car;
    }
    
    public int getRentDur(){
        return rentDur;
    }
}
