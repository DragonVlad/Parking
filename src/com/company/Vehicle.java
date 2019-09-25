package com.company;

public class Vehicle implements  Comparable<Vehicle>{
    private String registrationNumber;
    private VehicleMarka manufacturer;
    private String model;
    private  VehicleTypes type;  //доделать конструкторы сет гет тустринг и майн!!!!
    public Vehicle(){
        registrationNumber = "1-te";
        manufacturer = VehicleMarka.BMW;
        model = "X6";
        type = VehicleTypes.CAR;
    }
    public Vehicle(String registrationNumber, VehicleMarka manufacturer, String model, VehicleTypes type){
        this.registrationNumber = registrationNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
    }
    public Vehicle(String registrationNumber, String manufacturer, String model, String type){
        this.registrationNumber = registrationNumber;

        this.model = model;

        if (manufacturer.equals("BMW"))
            this.manufacturer = VehicleMarka.BMW;
        else if (manufacturer.equals("Mercedes"))
            this.manufacturer = VehicleMarka.Mercedes;
       else  if (manufacturer.equals("Toyota"))
            this.manufacturer = VehicleMarka.Toyota;
        else if (manufacturer.equals("Volkswagen"))
            this.manufacturer = VehicleMarka.Volkswagen;
        else if (manufacturer.equals("Peugeot"))
            this.manufacturer = VehicleMarka.Peugeot;
        else
            this.manufacturer = VehicleMarka.Other;
        if(type.equals("CAR")){
            this.type = VehicleTypes.CAR;
        }else if(type.equals("MOTOR_BIKE")){
            this.type = VehicleTypes.MOTOR_BIKE;
        }
        else if(type.equals("TRUCK")){
            this.type = VehicleTypes.TRUCK;
        }
        else {
            this.type = VehicleTypes.Other;
        }
    }
    public VehicleTypes getType() {return type;}
    public void setType(VehicleTypes type) {this.type = type;}
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public VehicleMarka getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public void setManufacturer(VehicleMarka manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String toString(){
        return "Автомобиль с номером " + registrationNumber + " модели " + model + " марки " + manufacturer + " типа " + type;
    }

    @Override
    public int compareTo(Vehicle v) {
        return registrationNumber.compareTo(v.registrationNumber);
    }
}
