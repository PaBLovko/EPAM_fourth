package by.epam.intro.task1.logic;

import by.epam.intro.task1.bean.Area;
import by.epam.intro.task1.bean.Region;
import by.epam.intro.task1.bean.State;

public class StateLogic {

	public double getStateSquare(State state){
		double square = 0;
		for (Region region : state.getRegionArrayList()){
			for (Area area : region.getAreaArrayList()) {
				square += area.getAreaSquare();
			}
		}
		return square;
	}
}
