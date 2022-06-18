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
public class CarData {
     //menampung data tipe data car
    public static ArrayList<Car> carList = new ArrayList<>();
    
    //fungsi untuk menambahkan mobil
    public void addCar (String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }
    
    //setter getter dr carlist
    public ArrayList<Car> getCarList(){
        return carList;
    }
    
    public void setCarList (ArrayList<Car> carList) {
        CarData.carList = carList;
    }
    
    //berisi data dr mobil
    public void listOfCar(){
        
        System.out.println("========================================");
        System.out.println("\t\t LIST MOBIL \t\t");
        
        System.out.println("========================================");
        CarData.carList.stream().map((data) -> {
            System.out.println("TIPE MOBIL  :" + data.getCarType());
            return data;
        }).map((data) -> {
            System.out.println("NO.POLISI   :" + data.getPolNum());
            return data;
        }).map((data) -> {
            System.out.println("MERK        :" + data.getMerk());
            return data;
        }).forEachOrdered((_item) -> {
            System.out.println("----------------------------------------");
        });
    }
}
