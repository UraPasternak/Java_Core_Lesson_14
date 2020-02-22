package ua.lviv.lgs.hw14.zavdania1;

import java.util.Comparator;

public class ComparatorCar implements Comparator<Car> {

	@Override
	public int compare(Car arg0, Car arg1) {
		if (arg0.getMarka().compareTo(arg1.getMarka()) > 0) {
			return 1;
		} else if (arg0.getMarka().compareTo(arg1.getMarka()) < 0) {
			return -1;
		} else {
			if (arg0.getRikVypusku() > arg1.getRikVypusku()) {
				return 1;
			} else if (arg0.getRikVypusku() < arg1.getRikVypusku()) {
				return -1;
			}

		}
		return 0;
	}

}
