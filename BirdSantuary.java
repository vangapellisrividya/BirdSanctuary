package com.bl.birdsantuary;

import java.util.Scanner;

import com.bl.birdsantuary.Bird.Colour;

public class BirdSantuary {
	static final Scanner SC = new Scanner(System.in);

	static BirdSantuaryMannager birdSantuaryManager = BirdSantuaryMannager.getInstance() ;
	public static void main(String[] args) {

//		Dove dove = new Dove();
//		dove.id = "dov001";
//
//		Parrot parrot = new Parrot();
//		parrot.id = "par001";
//
//		Penguin penguin = new Penguin();
//		penguin.id = "pen001";
//
//		Sparrow sparrow = new Sparrow();
//		sparrow.id = "spar001";
//
//		birdSantuaryManager.add(dove);
//		birdSantuaryManager.add(parrot);
//		birdSantuaryManager.add(penguin);
//		birdSantuaryManager.add(sparrow);

		// birdSantuaryManager.print();
		// birdSantuaryManager.printFlyable();
		// birdSantuaryManager.printSwimmable();

		BirdSantuary birdSantuary = new BirdSantuary();
		birdSantuary.showoptions();
	}

	
	public void showoptions() {
		
		int choice = 0;
		 BirdSantuaryMannager birdSantuaryManager = BirdSantuaryMannager.getInstance() ;
		while (choice != 10) {
			System.out.println("1.add bird\n2.remove bird\n3.update bird\n4.print all "
					+ "the birds\n5.flyable birds\n6.swimmable birds\n10.Exit");

			System.out.println("choose any option from menu");
			choice = SC.nextInt();
			switch (choice) {
			case 1:
				Bird bird = new Bird();
				System.out.println("choose bird colour");
				System.out.println("1.white\n2.Black\n3.Gray\n4.Green");
				
				System.out.println("Enter the colour");
				int option ;
				option = SC.nextInt();
				switch( option )
				{
					case 1:
						
						bird.colour = Colour.WHITE;
						
						System.out.println(bird.colour);
						break;
					case 2:
						bird.colour = Colour.BLACK;
						
						System.out.println(bird.colour);
						break;
				
					case 3:	
						bird.colour = Colour.GRAY;
						
						System.out.println(bird.colour);
						break;
					case 4:
						bird.colour = Colour.GREEN;
						
						System.out.println(bird.colour);
						 break;
				}
				System.out.println("Enter the bird name");
				bird.name = SC.next();
				
				System.out.println("Enter the bird id");
				bird.id = SC.next();
				
				System.out.println("Enter isFlyable (true or false) ");
				bird.isFlyable =SC.nextBoolean();
				
				System.out.println("Enter isSwimmable (true or false) ");
				bird.isSwimmable =SC.nextBoolean();
				
				birdSantuaryManager.add(bird);
				
				
				break;
			case 2:
				System.out.println("enter the bird which you want to remove");
				String id = SC.next();
				birdSantuaryManager.getBird(id);
				Bird b = birdSantuaryManager.getBird(id);
				birdSantuaryManager.remove(b);
				
				break;
			case 3:
				
				break;
			case 4:
				birdSantuaryManager.print();
				break;
			case 5:
				birdSantuaryManager.printFlyable();
				break;
			case 6:
				birdSantuaryManager.printSwimmable();
			case 10:
				break;

			}
		}
	}
}
