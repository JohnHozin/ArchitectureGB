package Seminar4;

import java.text.DecimalFormat;
import java.util.Date;

public class Ticket {
    private long id;
    private int departureZone;
    private int arrivalZone;
    private Date departureTime;
    private Date arrivalTime;
    private long buyerId;
    private boolean isUsed;
    private DecimalFormat price;
    private String place;

    public Ticket(long id, int departureZone, int arrivalZone, Date departureTime, Date arrivalTime, long buyerId, boolean isUsed, DecimalFormat price, String place) {
        this.id = id;
        this.departureZone = departureZone;
        this.arrivalZone = arrivalZone;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.buyerId = buyerId;
        this.isUsed = isUsed;
        this.price = price;
        this.place = place;
    }

    public Ticket() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDepartureZone() {
        return departureZone;
    }

    public void setDepartureZone(int departureZone) {
        this.departureZone = departureZone;
    }

    public int getArrivalZone() {
        return arrivalZone;
    }

    public void setArrivalZone(int arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
