package NewImplement;

import java.util.Timer;
import java.util.TimerTask;

public class Operation implements OperationIF {

	Timer timerWait = new Timer();
	
	private void displayMessage(String message){
		
		System.out.println(message);
	}
	
	@Override
	public void move(int requestFloor) {
		// TODO Auto-generated method stub
		displayMessage("Lift is moving to " + requestFloor);
		open(requestFloor);
		wait(requestFloor);
		close(requestFloor);
	}

	@Override
	public void close(int requestFloor) {
		// TODO Auto-generated method stub
		displayMessage("Lift is closed " + requestFloor);
	}

	@Override
	public void open(int requestFloor) {
		// TODO Auto-generated method stub
		displayMessage("Lift is opened " + requestFloor);
	}

	@Override
	public void wait(final int requestFloor) {
		// TODO Auto-generated method stub
		
		timerWait.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				displayMessage("Lift is waiting " + requestFloor);
				this.cancel();
				
			}
		}, 3000, 0);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
