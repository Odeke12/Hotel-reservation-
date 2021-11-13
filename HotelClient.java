import java.net.MalformedURLException;
import java.rmi.Naming;

public class HotelClient{
    public static void main(String [] args){
        try{
            RoomManager h = (RoomManager)
 
            Naming.lookup("rmi://localhost:1099/HotelService");

            System.out.println(h.book("type_2","Odeke"));
            System.out.println(h.guests());
            System.out.println(h.list());


        }catch(Exception e){
            System.out.println("Exception received :");
            System.out.println(e);
        }
    }}
