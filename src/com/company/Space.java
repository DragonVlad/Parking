package com.company;

public class Space {
    private Vehicle vehicle;
    private Person person;
    private boolean empty;
    public Space(){
        vehicle = null;
        person = null;
        empty = true;
    }
    public Space(Vehicle v, Person p){
        vehicle = v;
        person = p;
        empty = false;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public Person getPerson(){
        return  person;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void setPerson(Person person){
        this.person = person;
    }
    public boolean isEmpty(){
        return empty;   //или    return person==null
    }
}
