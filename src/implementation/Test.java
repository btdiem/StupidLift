package implementation;

import java.io.ObjectInputStream.GetField;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lift l = new Lift(1, 9);
		//l.launch();
		
		
		Lift l2 = new Lift(0,3);
		int moves=0;
		int startFloor=0;
		int destFloor=10;
		
		while(l2.currentfloor<destFloor){
			l2.move(l2.getcurrentfloor());
			l2.stop();
			
			if(l2.currentfloor==startFloor && l2.updirection==true){
				
				moves++;
			}
			System.currentTimeMillis();
		}
		System.out.println("moves:"+moves);
	}

}
