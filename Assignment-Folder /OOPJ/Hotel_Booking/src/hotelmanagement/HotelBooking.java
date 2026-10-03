package hotelmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelBooking {

    private List<Room> rooms;
    private Map<Customer, Room> bookings;

    // Constructor
    public HotelBooking() {
        rooms = new ArrayList<>();
        bookings = new HashMap<>();
    }

    // Add a room
    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
    }

    // Display all rooms
    public void displayRooms() {

        System.out.println("\n========== ROOM LIST ==========");

        for (Room room : rooms) {

            room.displayRoom();

            System.out.println("-------------------------------");
        }
    }

    // Search room by ID
    public Room findRoom(int roomId) {

        for (Room room : rooms) {

            if (room.getRoomId() == roomId) {
                return room;
            }
        }

        return null;
    }

    // Book a room
    public void bookRoom(Customer customer, int roomId)
            throws RoomNotAvailableException,
                   InvalidBookingException {

        // Validate customer
        if (customer == null) {
            throw new InvalidBookingException(
                "Invalid customer."
            );
        }

        // Find room
        Room room = findRoom(roomId);

        // Room doesn't exist
        if (room == null) {
            throw new InvalidBookingException(
                "Room " + roomId + " does not exist."
            );
        }

        // Check availability
        if (!room.isAvailable()) {
            throw new RoomNotAvailableException(
                "Room " + roomId + " is not available."
            );
        }

        // Check whether customer already has a booking
        if (bookings.containsKey(customer)) {
            throw new InvalidBookingException(
                "Customer already has a booking."
            );
        }

        // Mark room unavailable
        room.setAvailable(false);

        // Store booking
        bookings.put(customer, room);

        System.out.println(
            "Booking successful for " +
            customer.getName()
        );

        // Demonstrate polymorphism
        room.bookRoom();
    }

    // Cancel booking
    public void cancelBooking(Customer customer)
            throws InvalidBookingException {

        if (customer == null) {
            throw new InvalidBookingException(
                "Invalid customer."
            );
        }

        // Check whether booking exists
        if (!bookings.containsKey(customer)) {
            throw new InvalidBookingException(
                "No booking found for " +
                customer.getName()
            );
        }

        // Get booked room
        Room room = bookings.get(customer);

        // Make room available again
        room.setAvailable(true);

        // Remove booking
        bookings.remove(customer);

        System.out.println(
            "Booking cancelled for " +
            customer.getName()
        );
    }

    // Display all bookings
    public void displayBookings() {

        System.out.println("\n======== CURRENT BOOKINGS ========");

        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        for (Map.Entry<Customer, Room> entry
                : bookings.entrySet()) {

            Customer customer = entry.getKey();
            Room room = entry.getValue();

            System.out.println(
                "Customer : " + customer.getName()
            );

            System.out.println(
                "Room     : " + room.getRoomId()
            );

            System.out.println(
                "Type     : " + room.getRoomType()
            );

            System.out.println(
                "Price    : " + room.getPrice()
            );

            System.out.println("-------------------------------");
        }
    }
}
