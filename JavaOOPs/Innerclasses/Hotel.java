package Innerclasses;

public class Hotel {
    
    private String name;
    private int totalRooms;
    private int reservedRooms;


    public Hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRooms(String guestName, int noofRooms){
        class ReservationValidator {

            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    return false;
                }

                if (noofRooms < 0) {
                    System.out.println("no of rooms must be positive");
                    return false;
                }

                if(noofRooms + reservedRooms > totalRooms){
                    System.out.println("not enough rooms available");
                    return false;
                }

                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms += noofRooms;
            System.out.println("reservation confirm for " + guestName + " for " + noofRooms);
        }else{
            System.out.println("reservation failed ");
        }
    }
}
