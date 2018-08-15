package builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public interface SubscriptionBuilder {

    SubscriptionBuilder reset();

    SubscriptionBuilder setAdvAllowed();

    SubscriptionBuilder setPrice(BigDecimal price);

    SubscriptionBuilder setStart(LocalDate start);

    SubscriptionBuilder setEnd(LocalDate end);

    SubscriptionBuilder setPeriod(Period period);

    SubscriptionBuilder setAddress(String address);

    Subscription build();
}
