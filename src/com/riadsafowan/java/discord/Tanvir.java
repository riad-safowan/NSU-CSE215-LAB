package com.riadsafowan.java.discord;

class Courier {

    int  CourierId;

    String Name_of_Courier;


    public Courier() {

    }

    public Courier(int courierId, String name_of_Courier) {

        CourierId = courierId;

        Name_of_Courier = name_of_Courier;

    }

    public int getCourierId() {

        return CourierId;

    }

    public void setCourierId(int courierId) {

        CourierId = courierId;

    }

    public String getName_of_Courier() {

        return Name_of_Courier;

    }

    public void setName_of_Courier(String name_of_Courier) {

        Name_of_Courier = name_of_Courier;

    }

    void printShipment(double Base_fare)

    {

        double Shipping_Charge;

        Shipping_Charge = Base_fare + 20;

        System.out.println("Courier Id is : "+CourierId);

        System.out.println("Name of Courier is: "+getName_of_Courier());

        System.out.println("Shipping Charges is : "+Shipping_Charge);

    }

}
class International_Services extends Courier{
    String Destination;

    int Number_of_Parcels;



    public International_Services(){

    }



    public International_Services(String destination, int number_of_Parcels) {

        super();

        Destination = destination;

        Number_of_Parcels = number_of_Parcels;

    }

    public String getDestination() {

        return Destination;

    }

    public void setDestination(String destination) {

        Destination = destination;

    }

    public int getNumber_of_Parcels() {

        return Number_of_Parcels;

    }

    public void setNumber_of_Parcels(int number_of_Parcels) {

        Number_of_Parcels = number_of_Parcels;

    }

    void printShipment(double Base_fare)

    {

        double total_Shipping_Charge;

        total_Shipping_Charge = Base_fare * Number_of_Parcels;

        System.out.println("Destination is : "+Destination);

        System.out.println("Number of Parcels is: "+Number_of_Parcels);

        System.out.println("Shipping Charges is : "+total_Shipping_Charge);

        if(total_Shipping_Charge>100)

        {

            System.out.println("More Sale");

        }

        else {

            System.out.println("Less Sale");

        }

    }

}
class Controlling {

    public static void main(String[] args){


        Courier inter=new International_Services("London",55);

        inter.printShipment(22);

        inter.printShipment(11);


        Courier courier=new Courier(011,"Jhon logistics");

        courier.printShipment(55);

    }

}
