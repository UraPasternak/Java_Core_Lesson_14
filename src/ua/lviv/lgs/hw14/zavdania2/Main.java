package ua.lviv.lgs.hw14.zavdania2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Commodity t = new Commodity();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("������ 1, ��� ������ �����");
			System.out.println("������ 2, ��� �������� �����");
			System.out.println("������ 3, ��� ������� �����");
			System.out.println("������ 4, ��� ��������� ����� �� ����");
			System.out.println("������ 5, ��� ��������� ����� �� ��������");
			System.out.println("������ 6, ��� ��������� ����� �� �������");
			System.out.println("������ 4, ��� ��������� ����� �� �����");
			System.out.println("������ 8, ��� �������� ����� �� ��������");
			System.out.println("������ 9, ��� �����");

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
