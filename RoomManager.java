import java.rmi.*; 

public interface RoomManager extends Remote{
	public String book(String a, String b)
		throws RemoteException;

	public String list()
		throws RemoteException;

	public String guests()
		throws RemoteException; 

	public String revenue()
		throws RemoteException;
} 