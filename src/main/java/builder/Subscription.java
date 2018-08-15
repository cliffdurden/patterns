package builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Subscription {

    private boolean isAdvAllowed;
    private BigDecimal price = BigDecimal.ZERO;
    private LocalDate start;
    private LocalDate end;
    private Period period;
    private String address;

    public boolean isAdvAllowed() {
        return isAdvAllowed;
    }

    public void setAdvAllowed(boolean advAllowed) {
        isAdvAllowed = advAllowed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
