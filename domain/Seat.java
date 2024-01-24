package domain;

import enums.SeatType;

public class Seat {
    private int seatId;
    private SeatType seatType;
    private String row;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
}
