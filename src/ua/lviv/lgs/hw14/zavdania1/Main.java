package ua.lviv.lgs.hw14.zavdania1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Car> s = new HashSet<>();
		s.add(new Car("Audi", 2000));
		s.add(new Car("Woltsvagen", 2001));
		s.add(new Car("Shcoda", 2010));
		s.add(new Car("Audi", 2005));
		s.add(new Car("BMV", 2000));
		
		for(Car car: s){
			System.out.println(car);
		}
		
		System.out.println("==========================================");
		
		TreeSet<Car> ts = new TreeSet<>();
		ts.addAll(s);
		
		for(Car car: ts){
			System.out.println(car);
		}
		
		System.out.println("==========================================");
		
		TreeSet<Car> tsall = new TreeSet<>(new ComparatorCar());
		tsall.addAll(s);
		
		for(Car car: tsall){
			System.out.println(car);
		}
	}

}
