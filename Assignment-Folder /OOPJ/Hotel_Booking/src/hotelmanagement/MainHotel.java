package hotelmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainHotel {

    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();

        Map<Customer, Room> bookings =
                new HashMap<>();

        rooms.add(
            new LuxuryRoom(
                101,
                5000,
                "AC, TV"
            )
        );

        rooms.add(
            new LuxuryRoom(
                102,
                5500,
                "AC, TV, Kettle"
            )
        );

        rooms.add(
            new EconomyRoom(
                501,
                2000,
                "Fan, Geyser"
            )
        );

        rooms.add(
            new EconomyRoom(
                502,
                2500,
                "Cooler, Geyser"
            )
        );

        Customer c1 =
                new Customer(
                    1,
                    "Amit",
                    "amit@gmail.com"
                );

        Customer c2 =
                new Customer(
                    2,
                    "Priya",
                    "priya@gmail.com"
                );

        System.out.println(
                "====== Available Rooms ======"
        );

        for (Room r : rooms) {
            r.displayRoom();
            System.out.println(
                    "=============================="
            );
        }

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Room no. you want to book: "
        );

        int searchRoomId = sc.nextInt();

        try {

            bookRoom(
                c1,
                searchRoomId,
                rooms,
                bookings
            );

        }
        catch (RoomNotAvailableException |
               InvalidBookingException e) {

            System.out.println(
                    "Booking Error: "
                    + e.getMessage()
            );
        }

        System.out.println(
                "\nCurrent Bookings:"
        );

        for (Map.Entry<Customer, Room> entry
                : bookings.entrySet()) {

            System.out.println(
                    entry.getKey()
                    + " -> "
                    + entry.getValue()
            );
        }

        sc.close();
    }


    public static void bookRoom(
            Customer customer,
            int roomId,
            List<Room> rooms,
            Map<Customer, Room> bookings)
            throws RoomNotAvailableException,
                   InvalidBookingException {

        if (customer == null) {

            throw new InvalidBookingException(
                    "Customer is invalid."
            );
        }

        Room selectedRoom = null;

        for (Room r : rooms) {

            if (r.getRoomId() == roomId) {

                selectedRoom = r;
                break;
            }
        }

        if (selectedRoom == null) {

            throw new InvalidBookingException(
                    "Room " + roomId
                    + " does not exist."
            );
        }

        if (!selectedRoom.isAvailable()) {

            throw new RoomNotAvailableException(
                    "Room " + roomId
                    + " is already booked."
            );
        }

        if (bookings.containsKey(customer)) {

            throw new InvalidBookingException(
                    "Customer already has a booking."
            );
        }

        selectedRoom.bookRoom();

        bookings.put(
                customer,
                selectedRoom
        );

        System.out.println(
                "Booking successful for "
                + customer.getName()
        );
    }


    public static void cancelBooking(
            Customer customer,
            Map<Customer, Room> bookings)
            throws InvalidBookingException {

        if (!bookings.containsKey(customer)) {

            throw new InvalidBookingException(
                    "No booking found for "
                    + customer.getName()
            );
        }

        Room room =
                bookings.get(customer);

        room.setAvailable(true);

        bookings.remove(customer);

        System.out.println(
                "Booking cancelled successfully."
        );
    }
}