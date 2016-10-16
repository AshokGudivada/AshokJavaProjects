
public class Dealer {

	//instance variables
	private String name;
	private String address;
	private Car[] cars;
	private int numberCars;
	private int totalRetailValue;
	
	//default constructor
	public Dealer()
	{
		cars = new Car[10];
		numberCars = 0;
	}
		
	//constructor
	public Dealer(String name, String address)
	{
		this();
		this.setName(name);
		this.setAddress(address);
	}

	//getter and setters
	public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name = name;
			
		}
		
		public String getAddress(){
			return address;
		}
		
		public void setAddress (String address){
			this.address= address;
		
		}
		
		public Car[] getCars(){
			return cars;
		}
		public void addCar(Car car){
			cars[numberCars] = car;
			totalRetailValue += car.getRetailPrice();
			numberCars++;
		}
		public void removeCar(Car car){
			int carLocation = -1;
			totalRetailValue -= car.getRetailPrice();
			for (int i=0; i < numberCars; i++)
				if (cars[i]== car) carLocation = i;
			if (carLocation !=-1){
				for (int j=carLocation; j<numberCars; j++)
					cars[j] = cars[j+1];
				numberCars--;
			}
		}
		
		public int getCarCount(){
			return numberCars;
		}
		
		public void totalRetailValue (Car car){
			for (int i = 1; i > numberCars+1; i++){
				System.out.println("no :"+numberCars);
				totalRetailValue += car.getRetailPrice();
			}
			System.out.println("no :"+numberCars);
			totalRetailValue += car.getRetailPrice();
			System.out.println("totalRetailValue ="+totalRetailValue);
			System.out.println("no :"+numberCars);
		}
		
		public String toString(){
			return name+"\n TotalRetailValue of Car lot :" +totalRetailValue;
		}
}
