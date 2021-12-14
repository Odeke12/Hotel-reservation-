 import java.rmi.*;
import java.util.*;


public class RoomManagerImpl extends java.rmi.server.UnicastRemoteObject implements RoomManager{

    public static int room1 = 5;
    public static int room2 = 6;
    public static int room3 = 2;
    public static int room4 = 2;
    public static int room5 = 6;

    public static List<String> guests = new ArrayList<String>();

    public static Hashtable<String, String> guest_list = new Hashtable<String, String>();

    public static Map<String, List<String>> map = new HashMap<String, List<String>>();

	public RoomManagerImpl()
		throws RemoteException { 
			super();
		}

		  public String list()
            throws RemoteException{
           	  String room1 = RoomManagerImpl.room1 + " rooms of type 0 are available for 55,000UGX per night";
           	  String room2 = RoomManagerImpl.room2 + " rooms of type 1 are available for 75,000 UGX per night";
           	  String room3 = RoomManagerImpl.room2 + " rooms of type 2 are available for 80,000 UGX per night";
           	  String room4 = RoomManagerImpl.room2 + " rooms of type 3 are available for 150,000 UGX per night";
           	  String room5 = RoomManagerImpl.room2 + " rooms of type 4 are available for 230,000 UGX per night";
        	return room1 + "\n" + room2 + "\n" + room3 + "\n" + room4 + "\n" + room5;
            }


		public String book(String a, String b)
			throws RemoteException{
				int num = 3;

				if(a.equals("type_1")){
					if(RoomManagerImpl.room1 > 0){

						Enumeration<String> enumeration = RoomManagerImpl.guest_list.keys();
						while(enumeration.hasMoreElements()) {
							String key = enumeration.nextElement();
							// if(RoomManagerImpl.guest_list.get(key))
						}

						RoomManagerImpl.guest_list.put(a,b);
						RoomManagerImpl.guests.add(b);
						return "Room 1 is available";
					}
				}else if(a.equals("type_2")){

					if(RoomManagerImpl.room2 > 0){
						List<String> room_2 = new ArrayList<String>();
						room_2.add(b);
						RoomManagerImpl.map.put("type_2",room_2);
					for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            			String key = entry.getKey();
            			List<String> values = entry.getValue();
            			if(key.equals("type_2")){
            				for(String temp: values){
            					if(temp.equals(b)){
            						return "Already booked";
            					}
            				}
            			}

        			}
						return "Room is available";
					
				}else{
					return "Room number does not exist";
				}
				return a;
			}
		

		public String guests()
			throws RemoteException{
				//Get keys from the hashtable to iterate
				int show = 0;
				Enumeration<String> enumeration = RoomManagerImpl.guest_list.keys();
				//Iterate using keys
				 while(enumeration.hasMoreElements()) {
 
            	String key = enumeration.nextElement();
            	// System.out.println("Country : "  + key 
             //        + "\t\t President : "  + ht.get(key));
            	show ++;
        	}

				return "The guests are : " + RoomManagerImpl.guests;
			}
		

		public String revenue()
			throws RemoteException{
				return "Revenue will go here";
			}

//new booking service
		public String book(String a, String b)
			throws RemoteException{
				int num = 3;
				String[] rooms = {"type_0","type_1","type_2","type_3","type_4"};
			int picked_room;
				for(String temp: rooms){
				if(a.equals(temp)){
				if(temp.equals("type_0")){
					picked_room = this.room1;
				}
				else if(temp.equals("type_1")){
					picked_room = this.room2;
					return("Room "+picked_room);
				}
			
				return(temp + " is available ");
				}
			}

				return "Rooms are done";
			}

		
	
}