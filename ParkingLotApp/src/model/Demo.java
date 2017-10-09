package model;

public class Demo {

	public static void main(String[] args) {
//		  Ticket ticket = new Ticket(new ParkingSpace(),new Car("81424"));
//        Ticket ticket1 = new Ticket(new ParkingSpace(), new Car("123141"));
//        System.out.println(ticket.getTicketPrice());
//        TicketBag ticketBag = new TicketBag();
//        ticketBag.add(ticket);
//        System.out.println(ticketBag.findByLiscensePlate("81424").getParkingSpace());

		
		  TicketBag ticketBag = new TicketBag();
		  Ticket ticket = new Ticket(new ParkingSpace(),new Car("81424"));
          Ticket ticket1 = new Ticket(new ParkingSpace(), new Bus("123141"));
          ticketBag.add(ticket);
          ticketBag.add(ticket1);
          ticketBag.display();
//        System.out.println(ticketBag.findByLiscensePlate("81424").getParkingSpace().isParked());
//        ticket.getParkingSpace().park();
//        System.out.println(ticketBag.findByLiscensePlate("81424").getParkingSpace().isParked());
//        ticket.getParkingSpace().leaveParkingSpace(10);
//        System.out.println(ticketBag.findByLiscensePlate("81424").getParkingSpace().isParked());
//        ticket.calculatePrice();
//        System.out.println(ticket.getTicketPrice());
//        ParkingSpace r = new ParkingSpace();
//        ParkingSpace r1 = new ParkingSpace();
//        ParkingSpace r2 = new ParkingSpace();
//        ParkingSpace r3 = new ParkingSpace();
//        ParkingSpaceBag parkingSpaceBag = new ParkingSpaceBag();
//        System.out.println("------------");
//        parkingSpaceBag.add(r);
//        parkingSpaceBag.add(r1);
//        parkingSpaceBag.add(r2);
//        parkingSpaceBag.add(r3);
//        parkingSpaceBag.display();
//        System.out.println("------------");
//        parkingSpaceBag.remove(r1);
//        parkingSpaceBag.display();
//        System.out.println("------------");
//        parkingSpaceBag.add(r3);
//        parkingSpaceBag.display();

	}

}
