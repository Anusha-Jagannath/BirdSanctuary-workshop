package com.bl.birdsanctuary;

import java.util.EnumSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.showUserMenu();
		System.out.println("Good Bye!!!");

		/*
		 * Parrot parrot = new Parrot(); parrot.id = "p001"; Duck duck = new Duck();
		 * duck.id = "d001"; Ostrich ostrich = new Ostrich(); ostrich.id = "ost001";
		 * Penguin penguin = new Penguin(); penguin.id = "pn001"; Penguin penguin2 = new
		 * Penguin(); penguin2.id = "pn001";
		 * 
		 * BirdSanctuaryRepository birdSanctuaryRepository = new
		 * BirdSanctuaryRepository(); birdSanctuaryRepository.add(parrot);
		 * birdSanctuaryRepository.add(duck); birdSanctuaryRepository.add(ostrich);
		 * birdSanctuaryRepository.add(penguin); birdSanctuaryRepository.add(penguin2);
		 * 
		 * System.out.println("Before deleting"); birdSanctuaryRepository.print();
		 * 
		 * birdSanctuaryRepository.remove(penguin);
		 * 
		 * System.out.println("\nAfter deleting"); birdSanctuaryRepository.print();
		 */

	}

	public void showUserMenu() {
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		final int EXIT_VALUE = 10;

		while (option != EXIT_VALUE) {
			System.out.println("Enter your option");
			System.out.println("1. Add a bird\n2. Remove a Bird\n3. Print all the birds\n4. Print Swimable\n"
					+ "5. Print Flyable\n6. Print Eatable\n7. Edit bird" + EXIT_VALUE + ". Exit");
			option = scanner.nextInt();

			ViewLayer viewLayer = new ViewLayer();
			switch (option) {
			case 1:
				Parrot parrot = new Parrot();
				parrot.id = "p001";
				Duck duck = new Duck();
				duck.id = "d001";
				Ostrich ostrich = new Ostrich();
				ostrich.id = "ost001";
				Penguin penguin = new Penguin();
				penguin.id = "pn001";

				BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
				birdSanctuaryRepository.add(parrot);
				birdSanctuaryRepository.add(duck);
				birdSanctuaryRepository.add(ostrich);
				birdSanctuaryRepository.add(penguin);
				break;

			case 2:
				System.out.println("Enter the Bird name to be removed");
				Scanner reader = new Scanner(System.in);
				String name = reader.nextLine();
				birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
				Bird bird = birdSanctuaryRepository.getBird(name);
				if (bird == null) {
					System.out.println("Bird doesn't exist");
				} else {
					birdSanctuaryRepository.remove(bird);
					System.out.println(name + " removed");
				}
				break;

			case 3:
				viewLayer.print();
				break;

			case 4:
				viewLayer.printSwimmable();
				break;

			case 5:
				viewLayer.printFlyable();
				break;

			case 6:
				viewLayer.printEatable();
				break;
			case 7:
				editBird();
				break;
			}

		}

	}

	private void editBird() {
		System.out.println("1. Edit Bird name\n2. Edit id\n3. Bird color");
		System.out.println("Enter the bird name to edit");
		Scanner reader1 = new Scanner(System.in);
		String birdname = reader1.nextLine();

		Bird editBird = BirdSanctuaryRepository.getInstance().getBird(birdname);

		Scanner reader3 = new Scanner(System.in);
		int choice = reader3.nextInt();
		choice = 0;
		while (choice != 4) {
			switch (choice) {
			case 1:
				System.out.println("Enter the new name: ");
				String birdname1 = reader3.nextLine();
				editBird.name = birdname1;
				break;

			case 2:
				System.out.println("Enter the bird id: ");
				String id = reader3.nextLine();
				editBird.id = id;
				break;

			case 3:
				System.out.println("Enter the bird color: ");
				System.out.println("Choose the color:");

				String color = reader3.nextLine();
				int count = 1;
				for (Bird.Color color1 : EnumSet.allOf(Bird.Color.class)) {
					System.out.println(count + "." + color1);
					count++;
				}
				int colorChoice = reader1.nextInt();
				int count1 = 1;
				for (Bird.Color color1 : EnumSet.allOf(Bird.Color.class)) {
					if (colorChoice == count1) {
						editBird.color = color1;
					}
					count++;
				}
				break;
			}
		}
	}
}

