package tainBookingEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TicketBookingEngine {

	final int seats = 7;
	
	Map<String, Seat> seatInventory = new HashMap<>();
	Set<String> confirmedUsers = new HashSet<>();
	Queue<String> waitlistQueue = new LinkedList<>();
	List<String> auditLogs = new ArrayList<>();
	
	Seat seatObj = new Seat();
	
	final long LOCK_TIMEOUT_MS = 2000;
	
	public void bookSeat(String userId, String seatId) throws InvalidSeatException, DuplicateBookingException, SeatUnavailableException {
		
		if(!seatInventory.containsKey(seatId)) {
			throw new InvalidSeatException("Invalid Seat Id!!\n\tPlease Enter a Valild Seat Id");	
		}
		
		if(confirmedUsers.contains(userId)) {
			throw new DuplicateBookingException("This User Id has already Booked the Seat");
		}

		synchronized (seatObj) {
		
			if(seatObj.getStatus() == SeatStatus.AVAILABLE) {
				
				seatObj.setStatus(SeatStatus.LOCKED);
				seatObj.setLockedByUserId(userId);
				seatObj.setLockTimestamp(System.currentTimeMillis());
				
			}
			
			if(seatObj.getStatus() == SeatStatus.LOCKED || seatObj.getStatus() == SeatStatus.BOOKED) {
				throw new SeatUnavailableException("The Seat is not available!!");
			}
			
		}//end of synchronized block
		
	}//end of bookSeat
	
}//end of public class
