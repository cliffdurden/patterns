package builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class SubscriptionBuilderImpl implements SubscriptionBuilder {

    Subscription subscription;

    public SubscriptionBuilderImpl() {
        subscription = new Subscription();
    }

    @Override
    public SubscriptionBuilder reset() {
        subscription = new Subscription();
        return this;
    }

    @Override
    public SubscriptionBuilder setAdvAllowed() {
        subscription.setAdvAllowed(true);
        return this;
    }

    @Override
    public SubscriptionBuilder setPrice(BigDecimal price) {
        subscription.setPrice(price);
        return this;
    }

    @Override
    public SubscriptionBuilder setStart(LocalDate start) {
        subscription.setStart(start);
        return this;
    }

    @Override
    public SubscriptionBuilder setEnd(LocalDate end) {
        subscription.setEnd(end);
        return this;
    }

    @Override
    public SubscriptionBuilder setPeriod(Period period) {
        subscription.setPeriod(period);
        return this;
    }

    @Override
    public SubscriptionBuilder setAddress(String address) {
        subscription.setAddress(address);
        return this;
    }

    @Override
    public Subscription build() {
        return subscription;
    }
}
