import java.rmi.*;
import java.util.*;


public class RoomManagerImpl extends java.rmi.server.UnicastRemoteObject implements RoomManager{
    //Number of available rooms of each type
    public static int room1 = 5;
    public static int room2 = 6;
    public static int room3 = 2;
    public static int room4 = 2;
    public static int room5 = 6;

    //Price of each room
	public static int price_1 = 55000;
	public static int price_2 = 75000;
	public static int price_3 = 80000;
	public static int price_4 = 150000;
	public static int price_5 = 230000;

    public static List<String> guests = new ArrayList<String>();

    // public static Hashtable<String, String> guest_list = new Hashtable<String, String>();

    //Stores guests and their room types
    public static Map<String, List<String>> map = new HashMap<String, List<String>>();

    //Stores the booked guests per room type
    public static List<String> room_1 = new ArrayList<String>();
    public static List<String> room_2 = new ArrayList<String>();
	public static List<String> room_3 = new ArrayList<String>();
    public static List<String> room_4 = new ArrayList<String>();
    public static List<String> room_5 = new ArrayList<String>();

	public RoomManagerImpl()
		throws RemoteException { 
			super();
		}
		//Prints the list of rooms
		  public String list()
            throws RemoteException{
           	  String room1 = RoomManagerImpl.room1 + " rooms of type 0 are available for "+price_1+" UGX per night";
           	  String room2 = RoomManagerImpl.room2 + " rooms of type 1 are available for "+price_2+" UGX per night";
           	  String room3 = RoomManagerImpl.room3 + " rooms of type 2 are available for "+price_3+" UGX per night";
           	  String room4 = RoomManagerImpl.room4 + " rooms of type 3 are available for "+price_4+" UGX per night";
           	  String room5 = RoomManagerImpl.room5 + " rooms of type 4 are available for "+price_5+" UGX per night";
        	return room1 + "\n" + room2 + "\n" + room3 + "\n" + room4 + "\n" + room5;
            }

 
		public String book(String type, String guest_name)
			throws RemoteException{
				// int num = 3;
				// String[] rooms = {"type_0","type_1","type_2","type_3","type_4"};
		
				if(type.equals("type_1")){
					// boolean check = true;
					if(RoomManagerImpl.room1 > 0){
	
					
						//Book a room is the map is empty
						if (RoomManagerImpl.map.size() == 0){
                            RoomManagerImpl.room_1.add(guest_name);
							          RoomManagerImpl.room1 = RoomManagerImpl.room1 - 1;
            						RoomManagerImpl.map.put("type_1",RoomManagerImpl.room_1);
            						return "Booked room of type_1";	
						}else{ 
						//Loop through the map incase it's not empty
						for (Map.Entry<String, List<String>> entry : RoomManagerImpl.map.entrySet()) {
            			
            			String key = entry.getKey();
            			//Store the list of guests in a list called values
            			List<String> values = entry.getValue();
            			if(key.equals("type_1")){
            				for(String temp: values){
            					//Check if the user has already booked the room before
            					if(temp.equals(guest_name)){
									// check = false;
            						return "Already booked";
            					}else{
                                    RoomManagerImpl.room_1.add(guest_name);
            						//Book the room if they haven't
            						RoomManagerImpl.room1 = RoomManagerImpl.room1 - 1;
            						//Store the guest details in the map
            						RoomManagerImpl.map.put("type_1",RoomManagerImpl.room_1);
            						return "You have booked room of type_1";
            						
            					}
            			  }
            			}else{
                                    RoomManagerImpl.room_1.add(guest_name);
            						//Book the room if they haven't
            						RoomManagerImpl.room1 = RoomManagerImpl.room1 - 1;
            						//Store the guest details in the map
            						RoomManagerImpl.map.put("type_1",RoomManagerImpl.room_1);
            						return "You have booked room of type_1";
                        }
            		   }
        			}
						return "Room1 is available";
				}else{
					return "Room 1 is unavailable";
				}
					}
		
				else if(type.equals("type_2")){
					// boolean check = true;
					if(RoomManagerImpl.room2 > 0){
	
					
						//Book a room is the map is empty
						if (RoomManagerImpl.map.size() == 0){
                            RoomManagerImpl.room_2.add(guest_name);
							          RoomManagerImpl.room2 = RoomManagerImpl.room2 - 1;
            						RoomManagerImpl.map.put("type_2",RoomManagerImpl.room_2);
            						return "Booked room of type_2";	
						}else{ 
						//Loop through the map incase it's not empty
						for (Map.Entry<String, List<String>> entry : RoomManagerImpl.map.entrySet()) {
            			
            			String key = entry.getKey();
            			//Store the list of guests in a list called values
            			List<String> values = entry.getValue();
            			if(key.equals("type_2")){
            				for(String temp: values){
            					//Check if the user has already booked the room before
            					if(temp.equals(guest_name)){
									// check = false;
            						return "Already booked";
            					}else{
                                    RoomManagerImpl.room_2.add(guest_name);
            						//Book the room if they haven't
            						RoomManagerImpl.room2 = RoomManagerImpl.room2 - 1;
            						//Store the guest details in the map
            						RoomManagerImpl.map.put("type_2",RoomManagerImpl.room_2);
            						return "You have booked room of type_2";
            						
            					}
            			  }
            			}else{
                                    RoomManagerImpl.room_2.add(guest_name);
            						//Book the room if they haven't
            						RoomManagerImpl.room2 = RoomManagerImpl.room2 - 1;
            						//Store the guest details in the map
            						RoomManagerImpl.map.put("type_2",RoomManagerImpl.room_2);
            						return "You have booked room of type_2";
                        }
            		   }
        			}
						return "Room2 is available";
				}else{
					return "Room 2 is unavailable";
				}
					}else if(type.equals("type_3")){
					if(RoomManagerImpl.room3 > 0){
	
						//Book a room is the map is empty
						if (RoomManagerImpl.map.size() == 0){
                            RoomManagerImpl.room_3.add(guest_name);
						    RoomManagerImpl.room3 = RoomManagerImpl.room3 - 1;
            				RoomManagerImpl.map.put("type_3",RoomManagerImpl.room_3);
            				return "Booked room of type_3";	
						}else{ 
						//Loop through the map incase it's not empty
						for (Map.Entry<String, List<String>> entry : RoomManagerImpl.map.entrySet()) {
            			
            			String key = entry.getKey();
            			//Store the list of guests in a list called values
            			List<String> values = entry.getValue();
            			if(key.equals("type_3")){
            				for(String temp: values){
            					//Check if the user has already booked the room before
            					if(temp.equals(guest_name)){
            						return "Already booked";
									
            					}else{
                                    RoomManagerImpl.room_3.add(guest_name);
            						//Book the room if they haven't
            						RoomManagerImpl.room3 = RoomManagerImpl.room3 - 1;
            						//Store the guest details in the map
            						RoomManagerImpl.map.put("type_3",RoomManagerImpl.room_3);
            						return "You have booked room of type_3";
            						
            					}
            			  }
            			}else{
                                RoomManagerImpl.room_3.add(guest_name);
         						//Book the room if they haven't
            					RoomManagerImpl.room3 = RoomManagerImpl.room3 - 1;
            					//Store the guest details in the map
            					RoomManagerImpl.map.put("type_3",RoomManagerImpl.room_3);
            					return "You have booked type 3";
                        }
            		   }
        			}
						return "Room3 is available";
				}else{
                    return "Rooms of type 3 are done";
                }
					}
					else{
					//Prints if the room entered from the client does not exist
					return "Room number does not exist";
				}
		
			}
		

		public List<String> guests()
			throws RemoteException{
						List<String> names = new ArrayList<String>();
						for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            			// int len = 0;
            			// String key = entry.getKey();
            			//Store the list of guests in a list called values
            			List<String> values = entry.getValue();


            			for(String temp: values){
                        //Avoid printing duplicated
                        if(!names.contains(temp)){
            				names.add(temp);
                        }
            			  }
            	
			}
			return names;
		}

		public String revenue()
			throws RemoteException{
            //The money made from each room
			int revenue1 = (5 - RoomManagerImpl.room1) * RoomManagerImpl.price_1;
			int revenue2 = (6 - RoomManagerImpl.room2) * RoomManagerImpl.price_2;
			int revenue3 = (2 - RoomManagerImpl.room3) * RoomManagerImpl.price_3;
			int revenue4 = (2 - RoomManagerImpl.room4) * RoomManagerImpl.price_4;
			int revenue5 = (6 - RoomManagerImpl.room5) * RoomManagerImpl.price_5;
		
            
			  String room1 = (revenue1 == 0)? "Room 1 has brought no revenue" : "Room 1 has brought revenue of "+revenue1+" with "+room_1.size()+" guests";
           	  String room2 = (revenue2 == 0)? "Room 2 has brought no revenue" : "Room 2 has brought revenue of "+revenue2+" with "+room_2.size()+" guests";
           	  String room3 = (revenue3 == 0)? "Room 3 has brought no revenue" : "Room 3 has brought revenue of "+revenue3+" with "+room_3.size()+" guests";
           	  String room4 = (revenue4 == 0)? "Room 4 has brought no revenue" : "Room 4 has brought revenue of "+revenue4;
           	  String room5 = (revenue5 == 0)? "Room 5 has brought no revenue" : "Room 5 has brought revenue of "+revenue5;
        	return room1 + "\n" + room2 + "\n" + room3 + "\n" + room4 + "\n" + room5;
			}
		
	
}
