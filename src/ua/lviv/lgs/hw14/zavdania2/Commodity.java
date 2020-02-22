package ua.lviv.lgs.hw14.zavdania2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Commodity {

	private String name;
	private int length;
	private int width;
	private int weight;
	
	List<Commodity> comList = new ArrayList<Commodity>();
	Scanner scanner = new Scanner(System.in);

	public Commodity() {
		super();
	}
	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}
	
	public void addCommodity() {
		System.out.println("������ ��� ������:");
		String name = scanner.next();
		System.out.println("������ ������� ������:");
		int length = scanner.nextInt();
		System.out.println("������ ������ ������:");
		int width = scanner.nextInt();
		System.out.println("������ ���� ������:");
		int weight = scanner.nextInt();

		comList.add(new Commodity(name, length, width, weight));
		System.out.println(comList);

	}

	public void removeCommodity() {
		System.out.println("��� �������� ������ ������ ���� ���");
		String name = scanner.next();
		System.out.println("������ ");
		int length = scanner.nextInt();
		System.out.println("������ ");
		int width = scanner.nextInt();
		System.out.println("���� ");
		int weight = scanner.nextInt();

		Iterator<Commodity> commodityIterator = comList.iterator();

		while (commodityIterator.hasNext()) {

			Commodity commodity = commodityIterator.next();

			if ((commodity.getName().equals(name)) & (commodity.getLength() == length) & (commodity.getWidth() == width)
					& (commodity.getWeight() == weight)) {

				commodityIterator.remove();
				System.out.println(name.toString() + "����� ��������");
				System.out.println(comList);
			} else {
				System.out.println("������ ������ �� ����");
			}
		}

	}

	public void changeCommodity() {
		System.out.println("������ ����� ������ ���� ������� ������ ");
		String name = scanner.next();
		System.out.println("������ ���� ����� ");
		String newname = scanner.next();
		System.out.println("������ ������� ������ ���� ������� ������");
		int length = scanner.nextInt();
		System.out.println("������ ���� ������� ");
		int newlength = scanner.nextInt();
		System.out.println("������ ������ ������ ���� ������� ������ ");
		int width = scanner.nextInt();
		System.out.println("������ ���� ������ ");
		int newwidth = scanner.nextInt();
		System.out.println("������ ���� ������ ���� ������� ������ ");
		int weight = scanner.nextInt();
		System.out.println("������ ���� ���� ");
		int newweight = scanner.nextInt();

		for (Commodity commodity : comList) {

			if ((commodity.getName().equals(name)) & (commodity.getLength() == length) & (commodity.getWidth() == width)
					& (commodity.getWeight() == weight)) {
				System.out.println("����� ������:");
				commodity.setName(newname);
				commodity.setLength(newlength);
				commodity.setWidth(newwidth);
				commodity.setWeight(newweight);
			}
		}
		System.out.println(comList);
	}

	public void sortByName() {
		System.out.println("������ ����������� �� ����");
		comList.sort(new NameCommodityComparator());
		System.out.println(comList);
	}

	public void sortByLength() {
		System.out.println("������ ����������� �� ������");
		comList.sort(new LengthCommodityComparator());
		System.out.println(comList);
	}

	public void sortByWidth() {
		System.out.println("������ ����������� �� �����");
		comList.sort(new WidthCommodityComparator());
		System.out.println(comList);
	}

	public void sortByWeight() {
		System.out.println("������ ����������� �� �����");
		comList.sort(new WeightCommodityComparator());
		System.out.println(comList);
	}

	public void getCommodity() {
		System.out.println("������ ������ ������");
		int i = scanner.nextInt();

		if (i < (comList.size() - 1)) {
			System.out.println("������ " + i + " ����� " + comList.get(i));
		} else {

		}

	}


}
