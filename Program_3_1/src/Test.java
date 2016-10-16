
public class Test{
	public static void main (String[] args){
		//local variables
		Dealer dealer;
		Car car;
		
		//Create a new Dealer instance
		dealer = new Dealer("David's Car Lot", "Edmond, Ok");
		
		//Creat Car instance and add to dealer collection 
		Car car1 = new Car("JX123456708", "Chevrolet","Malibu",1973,"Maroon");
		dealer.addCar(car1);
		
		Car car2 = new Car("LG12322489", "Truimp", "TR6", 1973, "Green");
		dealer.addCar(car2);
		
		Car car3 = new Car ("TY12348908", "Alpha", "Spyder", 1985, "Red");
		dealer.addCar(car3);
		
		Car car4 = new Car ("QU12463484", "Porche", "911-Cabroler", 1984, "Red");
		dealer.addCar (car4);
		
		//print out all the cars
		System.out.println(dealer);
		for (int i = 0; i < dealer.getCarCount(); i++){
			System.out.println(dealer.getCars()[i]);
		}
		
		//remove a car
		dealer.removeCar(car2);
		
		//print out all the cars
		System.out.println(dealer);
		for (int i = 0; i < dealer.getCarCount(); i++){
			System.out.println(dealer.getCars()[i]);
		}
	}
}


