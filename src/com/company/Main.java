package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	    Car car;
	    car = CarFactory.buildCar("MAZDA", MazdaModel.MX5,Color.RED,1.7);
		System.out.println(car.toString());

		car = CarFactory.buildCar("KIA", KiaModel.RIO,Color.WHITE,1.99);
		System.out.println(car.toString());

		/*System.out.println("Hello Enter the name of the car we have two car Kia, Mazda");
		Enum ds = null;
    	Enum color = null;
    	String name="";
    	int a;
		Scanner sc = new Scanner(System.in);
		while (true){
			name=sc.next();
			if(name.equalsIgnoreCase("Kia")||name.equalsIgnoreCase("Mazda")){
				break;
			}
			System.out.println("we don’t have this. repeat again");
		}
		name=name.toUpperCase();

		if(name.equals("KIA")){
			System.out.println("We have models such as #1 "+KiaModel.RIO.toString()+" #2 "
					+KiaModel.SEDONA.toString()+" #3 "+KiaModel.OPTIMA.toString()+"Choose and enter the number");
			while (true){
				a=sc.nextInt();
				if(a<=3&&a>=1){
					switch (a){
						case 1: ds = KiaModel.RIO;
						break;
						case 2: ds = KiaModel.SEDONA;
						break;
						case 3: ds = KiaModel.OPTIMA;
						break;
					}
					break;
				}
				System.out.println("we don’t have this. repeat again");
			}
			System.out.println("We have colors such as #1 "+Color.RED.toString()+" #2 "
					+Color.
					GREY.toString()+" #3 "+Color.
					BLACK.toString()+"Choose and enter the number"+" #4 "+Color.WHITE.toString());
			while (true){
				a=sc.nextInt();
				if(a<=4&&a>=1){
					switch (a){
						case 1: color = Color.RED;
							break;
						case 2: color = Color.GREY;
							break;
						case 3: color = Color.BLACK;
							break;
						case 4: color=Color.WHITE;
							break;
					}
					break;
				}
				System.out.println("we don’t have this. repeat again");
			}
			System.out.println("Enter the engine");
			double engine = sc.nextDouble();
			car= CarFactory.buildCar(name,ds, (Color) color,engine);
			System.out.println("Your car "+car.toString());
		}
		else{
			//it is the same with Kia statement.
		}*/
    }
}
