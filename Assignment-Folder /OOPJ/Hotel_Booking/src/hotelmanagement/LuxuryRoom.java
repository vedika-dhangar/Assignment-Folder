package hotelmanagement;

class LuxuryRoom extends Room{
	private String amenities;
	
	LuxuryRoom(int roomId, double price, String amenities){
		super(roomId,"Luxury",price);
		this.amenities = amenities;
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
