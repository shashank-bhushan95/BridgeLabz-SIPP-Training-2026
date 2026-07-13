package Java_Polymorphism;

class Vehicle{
double fuelCost(double km){return 0;}
}
class Car extends Vehicle{
double fuelCost(double km){return km*6;}
}
class Bus extends Vehicle{
double fuelCost(double km){return km*12;}
}
class Bike extends Vehicle{
double fuelCost(double km){return km*2;}
}
class ElectricCar extends Vehicle{
double fuelCost(double km){return km*1;}
}
public class TransportCompany{
public static void main(String[] args){
Vehicle[] v={new Car(),new Bus(),new Bike(),new ElectricCar()};
for(Vehicle x:v){
System.out.println(x.fuelCost(10));
if(x instanceof Car)System.out.println("Car");
else if(x instanceof Bus)System.out.println("Bus");
else if(x instanceof Bike)System.out.println("Bike");
else if(x instanceof ElectricCar)System.out.println("ElectricCar");
}
}
}