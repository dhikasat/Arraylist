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
public class Car {
            //variabel global
        public String carType;
        public String polNum;
        public String merk;
        public boolean status;
        
        //konstruktor dengan parameter
        Car(String carType, String polNum, String merk, boolean status){
            this.carType = carType;
            this.polNum = polNum;
            this.merk = merk;
            this.status = status;
        }
        
        //konstruktor dengan parameter
        Car (String carType, String polNum, String merk){
            this.carType = carType;
            this.polNum = polNum;
            this.merk = merk;
        }
        
        //setter getter
        public String getCarType(){
            return carType;
        }
        
        public String getPolNum(){
            return polNum;
        }
        
        public String getMerk(){
            return merk;
        }
        
        public boolean isStatus(){
            return status;
        }
    }
