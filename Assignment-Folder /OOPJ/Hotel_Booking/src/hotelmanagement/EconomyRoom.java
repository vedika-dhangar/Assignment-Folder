package hotelmanagement;


class EconomyRoom extends Room{
	
	private String amenities;
	
	EconomyRoom(int roomId, double price, String amenities){
		super(roomId,"Economy",price);
		this.amenities=amenities;
		
	}
	@Override
	public void bookRoom() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("Luxury Room booked...!");
		}
		
	}
	@Override
	public void displayRoom() {
		super.displayRoom();
		System.out.println("Amenities   :"+amenities);
	}

}
