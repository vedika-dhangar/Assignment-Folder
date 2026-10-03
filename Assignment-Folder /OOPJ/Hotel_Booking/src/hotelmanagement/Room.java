package hotelmanagement;

 class Room {
	protected int roomId;
	protected String roomType;
	protected double price;
	protected boolean isAvailable = true;

	Room(){
		this(0,"Single",0.0);
		}
	Room(int roomId,String roomType){
		this(roomId,roomType,0);
	}
	Room(int roomId, String roomType, double price){
		this.roomId = roomId;
		this.roomType = roomType;
		this.price = price;
		this.isAvailable = true;
	}
	public int getRoomId() {
		return roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public double getPrice() {
		return price;
	}
	public boolean isAvailable() {
		return isAvailable;

	}
	  public void setAvailable(boolean available) {
	        isAvailable = available;
	    }
	public void displayRoom() {
		
		System.out.println("Room Id   : " +roomId);
		System.out.println("Room Type : " +roomType);
		System.out.println("Price     : " +price);
		System.out.println("Available : " +isAvailable);

	}
	@Override
	public String toString() {
	    return "Room " + roomId + " (" + roomType + ")";
	}
	public void bookRoom() {

	    if (isAvailable) {
	        isAvailable = false;
	        System.out.println("Room booked.");
	    }
	}
	
	}
	

