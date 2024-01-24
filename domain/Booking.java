package domain;

import java.util.List;

public class Booking {

    private String bookingId;
    private String paymentId;
    private List<Seat> bookedSeatIds;
    private Show show;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public List<Seat> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Seat> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}

