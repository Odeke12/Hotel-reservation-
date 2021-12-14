import java.net.MalformedURLException;
import java.rmi.Naming;
import java.util.*;

public class HotelClient{
    public static List<String> guests = new ArrayList<String>();
    public static void main(String [] args){
        try{
            RoomManager h = (RoomManager)
 

            Naming.lookup("rmi://localhost:1099/Hotel");

        if(args.length >= 1){
            if(args[0].equals("list")){
                System.out.println(h.list());
            }else if(args[0].equals("book") && args.length == 3){
                System.out.println(h.book(args[1],args[2]));
            }else if(args[0].equals("guests")){
            List<String> my_guests = new ArrayList<String>();
            my_guests = h.guests();
            if(my_guests.size() == 0){
                System.out.println("No guests have booked yet");
            }else{
                System.out.println("List of all guests in the hotel");
                for(String guest: my_guests){
                     System.out.println(guest);
                }
            }
            }else if(args[0].equals("revenue")){
            System.out.println(h.revenue());
            }
        }else{
           		System.out.println("");
				System.out.println("Please use anyone of the following commands for RoomManagerImpl program:");
				System.out.println("");
				System.out.println("java HotelClient list <server address>");
				System.out.println("java HotelClient book <server address> <room type> <guest name>");
				System.out.println("java HotelClient guests <server address>:");
				System.out.println("java HotelClient revenue <server address>:");
				System.out.println("");
        }

            // System.out.println(h.book("type_1","Peter"));
            // System.out.println(h.book("type_2","Mike"));
            // System.out.println(h.book("type_3","James"));
            // System.out.println(h.book("type_3","Peter"));


            // System.out.println(my_guests);
            // System.out.println(h.list());


        }catch(Exception e){
            System.out.println("Exception received :");
            System.out.println(e);
        }
    }}
