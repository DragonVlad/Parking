package com.company;

import java.util.ArrayList;

public class OwnerFloor {
    private ArrayList<Space> spaces;
    int size;

    public OwnerFloor()
    {
        spaces = new ArrayList<>();
        size = 0;
    }
    public OwnerFloor(int size){
        this.size = size;
        spaces = new ArrayList<>(size);
    }

    public boolean add(Space s){
        size++;
        return spaces.add(s);
    }
    public void add(int index, Space s){
        try {
            spaces.add(index, s);
            size++;
        } catch(IndexOutOfBoundsException e){

        }
    }
    public void remove(int index) {
        try {
            spaces.remove(index);
            size--;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("impossible");
        }
    }
    public void remove(String reg){
        for(Space s : spaces){
            if (s.getVehicle().getRegistrationNumber().equals(reg))
                spaces.remove(s);
        }
    }
    public boolean hasSpace(String reg){
        for (Space s: spaces) {
            if(s.getVehicle().getRegistrationNumber().equals(reg)){
                return true;
            }
        }
        return false;
    }
    public Space get(String reg){
        for(Space s : spaces){
            if(s.getVehicle().getRegistrationNumber().equals(reg)){
                return s;
            }
        }
        return null;
    }
    public Space get(int index){
        try{
            return spaces.get(index);
        }
        catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    public void set(int index, Space s){
        try{
            spaces.set(index, s);
        }
        catch (IndexOutOfBoundsException e){

        }
    }
    public int size(){
        return size;
    }

    public ArrayList<Space> getSpaces() {
        return spaces;
    }
    public ArrayList<Vehicle> getVehicle(){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Space s: spaces){
            vehicles.add(s.getVehicle());
        }
        return vehicles;
    }
}
