package NewImplement;

public class Execution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Original version
		int numberOfFloors = 5;
		OperationIF operation = new Operation();
		boolean con = true;
	//	launch(con, numberOfFloors,operation);
		
		
		
		//First test  current floor 0,destination floor 10, current direction up, 
		int numberOfFloors1 = 10;
		OperationIF operation1 = new Operation();
		boolean con1 = true;
	//	launch1(con1, numberOfFloors1,operation1);
		
	  
		//Second test current floor 5, destionation floor 1, current direction up
		int numberOfFloors2=10;
		OperationIF operation2 = new Operation();
		boolean con2=true;
		launch2(con2, numberOfFloors2,operation2);
		
		
		//Second test current floor 5, destionation floor 1, current direction down
		int numberOfFloors3=10;
		OperationIF operation3 = new Operation();
		boolean con3=true;
	//	launch3(con3, numberOfFloors3,operation3);
		
	/*	
		while(con){
			
			long start = System.currentTimeMillis();
			
			for(int i=1; i<numberOfFloor; i++){
				operation.move(i);
				System.out.println("TIME MOVE FROM FLOOR " + i + " " + (System.currentTimeMillis() - start));
			}
			
			
			for(int i=numberOfFloor; i>=1; i--){
				operation.move(i);
				System.out.println("TIME MOVE FROM FLOOR " + i + " " + (System.currentTimeMillis() - start));
			}
		}
		
		*/

		
	}
	
	//Original
	
	public static void launch(boolean con,	int numberOfFloor,OperationIF operation ){
		while(con){
							
				goUp(numberOfFloor,  operation);
				goDown(numberOfFloor,operation);
		
				
				
				
			}
		}
	
	
	public static void goUp(int numberOfFloor, OperationIF operation){
		
		for(int i=1; i<numberOfFloor; i++){
			operation.move(i);
			System.out.println("Lift if on the floor " + i );
			
		}
		
	}
	
	public static void goDown(int numberOfFloor, OperationIF operation){
		for(int i=numberOfFloor; i>=1; i--){
			
			operation.move(i);
			System.out.println("Lift if on the floor " + i );
		}
		
	}
	
	
	//First Test
	public static void launch1(boolean con,	int numberOfFloor, OperationIF operation){
	while(con){
			
			long start = System.currentTimeMillis();
			long duration = 0;
			duration= goUp1(numberOfFloor, operation,start,duration);
			System.out.println("Duration of the trip is: "+duration);
			break;
	
			
			
			
		}
	}
	
	public static long goUp1(int numberOfFloor, OperationIF operation, long start, long duration){
		
		for(int i=1; i<numberOfFloor; i++){
			operation.move(i);
			duration = System.currentTimeMillis() - start;
			System.out.println("TIME MOVE FROM FLOOR " + i + " " + duration);
			if(i==numberOfFloor){
				System.out.println("Total time spent: " + duration);
				break;
			}
		}
		return duration;
	}
	
	public static long goDown1(int numberOfFloor, OperationIF operation, long start, long duration){
		for(int i=numberOfFloor; i>=1; i--){
			
			operation.move(i);
			//System.out.println("TIME MOVE FROM FLOOR " + i + " " + (System.currentTimeMillis() - start));
		}
		return duration;
	}
	
	
	//Second Test
	
	public static void launch2(boolean con,	int numberOfFloor,OperationIF operation ){
		while(con){
				
				long start = 0;
				long duration1=0,duration2 = 0;
				duration1= goUp2(numberOfFloor, operation,start,duration1);
				duration2 = goDown2(numberOfFloor, operation, start, duration1);
				System.out.println("Total time spent: " + duration1+duration2);
				break;
		
				
				
				
			}
		}
	
	
public static long goUp2(int numberOfFloor, OperationIF operation, long start, long duration){
		
		for(int i=0; i<numberOfFloor; i++){
			if(i==5){
				start = System.currentTimeMillis();
			}
			operation.move(i);
			if(i>=5){
				duration = System.currentTimeMillis() - start;
				System.out.println("TIME MOVE FROM FLOOR"  + i+" " + duration);
				
			}
		
			System.out.println("I "+i);
		
		}
		return duration;
	}

public static long goDown2(int numberOfFloor, OperationIF operation, long start, long duration){
	//start = System.currentTimeMillis();
	System.out.println("START "+start);
	long new_duration=0;
	for(int i=numberOfFloor; i>=1; i--){
		
		operation.move(i);
		new_duration = System.currentTimeMillis() ;
		if(i==1){
			break;
		}
		System.out.println("TIME MOVE FROM FLOOR " + i + " " + ( new_duration));
	}
	return new_duration + duration;
	}


	//Thurd Test
	public static void launch3(boolean con,	int numberOfFloor,OperationIF operation ){
	while(con){
			
			long start = 0;
			long duration = 0;
			duration= goDown3(numberOfFloor, operation,start,duration);
			System.out.println("Duration of the trip is: "+duration);
			break;
	
			
			
			
		}
	}
	
	public static long goDown3(int numberOfFloor, OperationIF operation, long start, long duration){
		for(int i=numberOfFloor; i>=1; i--){
			
			operation.move(i);
			
			if(i==5){
				start = System.currentTimeMillis();
			}
			
			if(i<=5){
				duration = System.currentTimeMillis() - start;
				System.out.println("TIME MOVE FROM FLOOR "  + i+" " + duration);
				
			}
			//System.out.println("TIME MOVE FROM FLOOR " + i + " " + (System.currentTimeMillis() - start));
		}
		return duration;
	}
}
