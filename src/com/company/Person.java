package com.company;

public class Person implements Comparable<Person>{
    //свойства объекта класса (конкретного Васи)
    private int id;
    private String fName, sName;

    //свойства и методы Класса (static) это свойства всего типа/класса Человек
    private static int count;
    public static int getCount() {  //static вызываем через имяКласса  Person.getCount()
        return count;
    }

    //конструкторы
    public Person(){
        fName = "";
        sName = "";
        count++;
        id = count;
    }
    public Person(String fName, String sName){
        this.fName = fName;
        this.sName = sName;
        count++;
        id = count;
    }
    public Person(Person p){ //конструктор копии объекта
        this.fName = p.fName;
        this.sName = p.sName;
        count++;
        id = count;
    }

    //getter
    public String getfName(){ //не static вызываем через объектКласса  vasja.getfName()
        return fName;
    }
    public String getsName(){
        return sName;
    }
    public int getId() {
        return id;
    }


    //setter
    public void setfName(String fName) {
        this.fName = fName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }


    @Override
    public String toString(){
        return id + " " + fName + " " + sName;
    }

    @Override
    public boolean equals(Object ob) {
        Person p = (Person)ob;
        return id==p.id;
    }


//    @Override //сортировка по умолчанию по id
//    public int compareTo(Person person) {  //0 - equals    1 - больше      -1 - меньше
//        return id-person.id;
//    }

    @Override //сортировка по умолчанию по sName
    public int compareTo(Person person) {  //0 - equals    1 - больше      -1 - меньше
        return sName.compareTo(person.sName);
    }
}
