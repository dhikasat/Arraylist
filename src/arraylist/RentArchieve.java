/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;
/**
 *
 * @author MS-USER
 */
public class RentArchieve {
     public static ArrayList<CarRent> rentData=new ArrayList<CarRent>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        rentData.add(new CarRent(rider, car, rentDur));
    }
    
    //tampilan info ttg peminjaman mobil
    public void info(){
        System.out.println("========================================");
        System.out.println("       \tINFORMASI PELANGGAN \t\t");
        System.out.println("========================================");
        
        for(CarRent data    : RentArchieve.rentData){
            System.out.println("NAMA PELANGGAN  :" + data.getRider().getName());
            System.out.println("TIPE MOBIL      :" + data.getCar().getCarType());
            System.out.println("NO. POLISI      :" + data.getCar().getPolNum());
            System.out.println("LAMA RENTAL     :" + data.getRentDur());
            
            System.out.println("====================================");
        }
    }
}
