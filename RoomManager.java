import java.rmi.*; 
import java.util.*;

public interface RoomManager extends Remote{
	public String book(String a, String b)
		throws RemoteException;

	public String list()
		throws RemoteException;

	public List<String> guests()
		throws RemoteException; 

	public String revenue()
		throws RemoteException;
} 