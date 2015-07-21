package implementation;

import java.util.ArrayList;
import java.util.List;



public class ClosedState extends DoorsState {
	
	int currentfloor;
	public ClosedState(){
		System.out.println("The doors are closed");
	}

	public List<String> nodes = new ArrayList<String>();
	
}
