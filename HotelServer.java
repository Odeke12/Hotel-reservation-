import java.rmi.Naming;

public class HotelServer{
    public HotelServer(){
        try{
            //HotelManager creates HotelManagerImpl object
 
            RoomManager h = new RoomManagerImpl();
 
            //Bind to the rmiregistry
        // System.setProperty("java.rmi.server.hostname","1.2.3.4");
        Naming.rebind("rmi://localhost:1099/HotelService", h);
        }catch(Exception e){
            System.out.println("Error: _" + e);
        } 
    } 
       public static void main(String args[]){
       new HotelServer();
       } 
    }

