package tainBookingEngine;

import java.util.Objects;

public class Seat{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7619715940070600127L;
	
	private final String seatId = "";
	private SeatStatus status;
	private String lockedByUserId;
	private String bookedByUserId;
	private long lockTimestamp = 0;

	public Seat() {}
		
	public Seat(SeatStatus status, String lockedByUserId, String bookedByUserId, long lockTimestamp) {
		super();
		this.status = status;
		this.lockedByUserId = lockedByUserId;
		this.bookedByUserId = bookedByUserId;
		this.lockTimestamp = lockTimestamp;
	}

	
	public SeatStatus getStatus() {
		return status;
	}

	public void setStatus(SeatStatus status) {
		this.status = status;
	}

	public String getLockedByUserId() {
		return lockedByUserId;
	}

	public void setLockedByUserId(String lockedByUserId) {
		this.lockedByUserId = lockedByUserId;
	}

	public String getBookedByUserId() {
		return bookedByUserId;
	}

	public void setBookedByUserId(String bookedByUserId) {
		this.bookedByUserId = bookedByUserId;
	}

	public long getLockTimestamp() {
		return lockTimestamp;
	}

	public void setLockTimestamp(long lockTimestamp) {
		this.lockTimestamp = lockTimestamp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSeatId() {
		return seatId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookedByUserId, Long.valueOf(lockTimestamp), lockedByUserId, seatId, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return Objects.equals(bookedByUserId, other.bookedByUserId) && lockTimestamp == other.lockTimestamp
				&& Objects.equals(lockedByUserId, other.lockedByUserId) && Objects.equals(seatId, other.seatId)
				&& status == other.status;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", status=" + status + ", lockedByUserId=" + lockedByUserId
				+ ", bookedByUserId=" + bookedByUserId + ", lockTimestamp=" + lockTimestamp + "]";
	}

}
