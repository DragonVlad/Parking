package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OwnerFloor of = new OwnerFloor(12);
        of.add(new Space(new Vehicle("22-TE",VehicleMarka.Volkswagen, "bla-la", VehicleTypes.TRUCK),new Person("Ivan", "Ivanov")));
        //....
    }
}


/*

        Person vasja = new Person("Ivan", "Ivanov");
        Person p2 = new Person("Sidr", "Sidorov");

        System.out.println("имя:"+vasja.getfName()+" фамилия:"+vasja.getsName());   //имяОбъекта.метод()
        System.out.println(p2);

        //демонстрация static
        System.out.println("****count=" + Person.getCount());  //имяКласса.метод()

        //массив
        System.out.println("****array:");
        Person p[] = new Person[3];
        p[0] = new Person("Kolya", "Lenin");
        p[1] = new Person("Lena", "ALenina");
        p[2] = new Person("Kolya", "BPetrov");

        for (Person person : p)
            System.out.println(person);

        //sort
        System.out.println("****sort array:");
        Arrays.sort(p);
        for (Person person : p)
            System.out.println(person);

        //коллекция
        System.out.println("****collection");
        ArrayList<Person> persons = new ArrayList();
        persons.add(new Person("Olya", "Lenina"));
        persons.add(new Person("Olesya", "Panina"));

        for (Person person : persons)
            System.out.println(person);

        System.out.println(persons);

 */



/*
 Vehicle v1 = new Vehicle();
        System.out.println(v1);
        Vehicle v2 = new Vehicle("24-ek","Volkswagen","Jetta");
        System.out.println(v2);
        Vehicle v3[] = new Vehicle[3];
        Scanner sc = new Scanner(System.in);
        String reg, manuf, model;
        for(int i = 0; i< v3.length; i++){
            System.out.println("enter reg number");
            reg = sc.nextLine();
            System.out.println("enter manuf");
            manuf = sc.nextLine();
            System.out.println("enter model");
            model = sc.nextLine();
            v3[i] = new Vehicle(reg,manuf,model);
        }
        Arrays.sort(v3);
        for(Vehicle v : v3){
            System.out.println(v);
        }
 */

/*
    Vehicle v1 = new Vehicle();
        System.out.println(v1);
                Vehicle v2 = new Vehicle("24-ek",VehicleMarka.Volkswagen,"Jetta", VehicleTypes.CAR);
                System.out.println(v2);
                int n;

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter count of car");
                n = sc.nextInt();
                Vehicle v3[] = new Vehicle[n];
                String reg, manuf, model,typ;
                reg = sc.nextLine(); //считываем \n из количества
                for(int i = 0; i< v3.length; i++){
        System.out.println("enter reg number");
        reg = sc.nextLine();
        System.out.println("enter manuf");
        manuf = sc.nextLine();
        System.out.println("enter model");
        model = sc.nextLine();
        System.out.println("enter type: ");
        typ = sc.nextLine();
        v3[i] = new Vehicle(reg,manuf,model, typ);
        }
        Arrays.sort(v3);
        for(Vehicle v : v3){
        System.out.println(v);
        }


 */

/*
        ArrayList<Space> spaces = new ArrayList<>(16);
        System.out.println(spaces);

        spaces.add(new Space(new Vehicle(),new Person()));
        System.out.println(spaces);

        spaces.add(1,new Space( new Vehicle(),new Person()));
        System.out.println(spaces);

        spaces.add(1,new Space( new Vehicle(),new Person()));
        System.out.println(spaces);

        spaces.remove(1);
        System.out.println(spaces);

        Space sp[] = new Space[5];
        for (Space s : sp) System.out.print(s+","); System.out.println();
        sp[2] = new Space( new Vehicle(),new Person());
        for (Space s : sp) System.out.print(s+","); System.out.println();
 */