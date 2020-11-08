package Week02;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for(MeetingRoom meetingRoom : meetingRooms){
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse(){
        for(int i = (meetingRooms.size() - 1); i >= 0; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEventNames(){
        for(int i = 1; i < meetingRooms.size(); i += 2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printAreas(){
        for(int i = 0; i < meetingRooms.size(); i++){
            System.out.println("A(z) " + (i + 1) + ". tárgyaló neve: " + meetingRooms.get(i).getName() +
                    ". A(z) " + (i + 1) + ". tárgyaló hosszúsága: " + meetingRooms.get(i).getLenght() + " m" +
                    ". A(z) " + (i + 1) + ". tárgyaló szélessége: " + meetingRooms.get(i).getWidth() + " m" +
                    ". A(z) " + (i + 1) + ". tárgyaló területe: " + meetingRooms.get(i).getArea() + " m\u00B2.");
        }
    }

    public void printMeetingRoomsWithName(String name){
        for(MeetingRoom meetingRoom : meetingRooms){
            if (meetingRoom.getName().toLowerCase().equals(name.toLowerCase())){
                System.out.println("A tárgyaló hosszúsága: " + meetingRoom.getLenght() + ". A tárgyaló szélessége: " + meetingRoom.getWidth() + ". A tárgyaló területe: " + meetingRoom.getArea() + " m\u00B2.");
            }
        }
    }

    public void printMeetingRoomsContains(String part){
        boolean talalat = false;
        for(MeetingRoom meetingRoom : meetingRooms){
            if(meetingRoom.getName().toLowerCase().contains(part.toLowerCase())){
                System.out.println("A tárgyaló neve: " + meetingRoom.getName() + ". A tárgyaló hosszúsága: " + meetingRoom.getLenght() + ". A tárgyaló szélessége: " + meetingRoom.getWidth() + ". A tárgyaló területe: " + meetingRoom.getArea() + " m\u00B2.");
                talalat = true;
            }
            }
        if(talalat = false){
            System.out.println("Nincs ilyen tárgyaló!!!");
        }
        }

        public void printAreasLargerThan(int area){
        for(MeetingRoom meetingRoom : meetingRooms){
            if(meetingRoom.getArea() > area){
                System.out.println("A tárgyaló neve: " + meetingRoom.getName() + ". A tárgyaló hosszúsága: " + meetingRoom.getLenght() + ". A tárgyaló szélessége: " + meetingRoom.getWidth() + ". A tárgyaló területe: " + meetingRoom.getArea() + " m\u00B2.");
            }
        }
        }

    }

