package basics.extra;
// place this class inside a package
// single line comments for readability of the program
// souce code - written by developer [human -readable format]
// c programming
//void test() {
//}

// oops : classes and objects
//LandVehicles : Cars, Buses
//Car mercedezBenz; swiftDesire;
// class body  {  group of statements } 
class Car {
	// statements end with a ; [delimiter]
	// int is a data type [restricts type of data you can store in memory]
	int noOfWheels;

	// constructor - get called automatically when creating the new car.
	Car(){
		int noOfWheels = 4;
	}

	void fillTheTank( int litres) {
	// print filled with petrol
		System.out.println("Filled with " + litres + " litres");
	}
	
	String pressTheHorn() {
	return "beep beep";
	}
}

class Person {
// strating point 
	public static void main(String [] stringArray) {
	// buy a vehicle
	// Car is a data type [resticts type of data you can store in memory]
	// int is primitive data type, Car is abstract data type.
	Car ferrariCar; // reference variable
	ferrariCar= new Car(); //instance [in the memory]
	ferrariCar.fillTheTank(10);
	ferrariCar.pressTheHorn();
	String hear = ferrariCar.pressTheHorn();
	System.out.println(hear);
	}
}