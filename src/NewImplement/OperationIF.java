package NewImplement;

public interface OperationIF {

	public void move(int requestFloor);
	public void close(int requestFloor);
	public void open(int requestFloor);
	public void wait(int requestFloor);
	public void start();
	public void stop();
	
}
