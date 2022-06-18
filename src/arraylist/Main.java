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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CarRider rider1 = new CarRider ("Surti", 17, "081234567890");
        CarRider rider2 = new CarRider ("Tejo", 19, "080987654321");
        CarRider rider3 = new CarRider ("Neira", 18, "08234234234");
        CarRider rider4 = new CarRider ("Tulus", 26, "08000000001");
        
        CarData data = new CarData ();
        //inisiasi objek dan car data
        data.addCar("SUV", "N 1234 XYZ", "Maserati");
        data.addCar("EV", "N 1709 MLG", "Hyundai");
        data.addCar("OFF ROAD", "L 7890 BNK", "Suzuki");
        data.addCar("SUPER CAR", "AD 4545 JKT", "Lamborghini");
       
        data.listOfCar();
        
        RentArchieve archieve = new RentArchieve();
        archieve.Rent(rider1 , data.getCarList().get(0), 14);
        archieve.Rent(rider2, data.getCarList().get(1), 31);
        archieve.Rent(rider3, data.getCarList().get(2), 24);
        archieve.Rent(rider4, data.getCarList().get(3), 20);
        
        System.out.println();
        //menampilkan informasi dari rider
        archieve.info(); 
    }
    
}
