package ua.lviv.lgs.hw14.zavdania2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Commodity t = new Commodity();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("¬вед≥ть 1, щоб додати товар");
			System.out.println("¬вед≥ть 2, щоб видалити товар");
			System.out.println("¬вед≥ть 3, щоб зам≥нити товар");
			System.out.println("¬вед≥ть 4, щоб сортувати товар за ≥м€м");
			System.out.println("¬вед≥ть 5, щоб сортувати товар за довжиною");
			System.out.println("¬вед≥ть 6, щоб сортувати товар за шириною");
			System.out.println("¬вед≥ть 4, щоб сортувати товар за вагою");
			System.out.println("¬вед≥ть 8, щоб отримати товар за ≥ндексом");
			System.out.println("¬вед≥ть 9, щоб вийти");

			int i = scanner.nextInt();

			switch (i) {
			case 1: {
				t.addCommodity();
				break;
			}
			case 2: {
				t.removeCommodity();
				break;
			}
			case 3: {
				t.changeCommodity();
				break;
			}
			case 4: {
				t.sortByName();
				break;
			}
			case 5: {
				t.sortByLength();
				break;
			}
			case 6: {
				t.sortByWidth();
				break;
			}
			case 7: {
				t.sortByWeight();
				break;
			}
			case 8: {
				t.getCommodity();
				break;
			}
			case 9: {
				System.exit(0);
				break;
			}

			}

		}

	}
}
