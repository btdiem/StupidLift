
package implementation;

public class Lift {
	public DoorsState theDoorsState;
	public int firstfloor;
	public int lastfloor;
	boolean updirection;
	public int currentfloor;
	public boolean readytomove;
	
	public Lift(int firstfloor, int lastfloor){
		
		this.firstfloor = firstfloor;
		this.lastfloor = lastfloor;
		this.theDoorsState = new ClosedState();
		updirection=true;
		
		currentfloor=firstfloor;
		setcurrentfloor(currentfloor);
		//launch();
		
	}
	
	public void launch(){
		for(int i=firstfloor;i<100;i++){
			
			this.move(getcurrentfloor());
			this.stop();
		}
	}
	
	public void move(int currentfloor){
	
		this.currentfloor = currentfloor;
		checkDirection(currentfloor);
		if(updirection){
			currentfloor++;
			setcurrentfloor(currentfloor);
		}else
		{
			currentfloor--;
			setcurrentfloor(currentfloor);
		}
		System.out.println("The lift is moving, next floor is: "+getcurrentfloor());
		
		
	}
	
	public void setcurrentfloor(int currentfloor){
		this.currentfloor = currentfloor;
		
	}
	public int  getcurrentfloor(){
		return currentfloor;
	}
	public void checkDirection(int currentFloor){
		if(currentFloor==lastfloor && updirection==true){
			
			updirection=false;
		}
		if(currentFloor==firstfloor && updirection==false ){
			updirection=true;
			
		}
		
		
	}
	
	public void openDoor(){
		System.out.println("The doors are opening");
		theDoorsState = new OpenedState();
	}
	
	public void closeDoor(){
		System.out.println("The doors are closing");
		theDoorsState = new ClosedState();
		
	}
	
	public void stop(){
	
		System.out.println("The lift is stopped on the floor ");
		openDoor();
		try {
			Thread.sleep(1000);
			System.out.println("The lift is waiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDoor();
		
	}
}
