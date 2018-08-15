package builder;

import java.time.LocalDate;
import java.time.Period;

public class SubscriptionBuildDirector {

    private SubscriptionBuilder subscriptionBuilder;

    public SubscriptionBuildDirector(SubscriptionBuilder subscriptionBuilder) {
        this.subscriptionBuilder = subscriptionBuilder;
    }

    public Subscription createAnnualFreeSubscription(LocalDate start, String address) {
        return subscriptionBuilder.reset()
                .setAddress(address)
                .setAdvAllowed()
                .setStart(start)
                .setEnd(start.plus(Period.ofYears(1)))
                .setPeriod(Period.ofMonths(1))
                .build();
    }
}
