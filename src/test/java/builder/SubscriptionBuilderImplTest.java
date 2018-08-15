package builder;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class SubscriptionBuilderImplTest {

    private Subscription subscription;
    private String address;
    private LocalDate start;

    @Before
    public void setUp() {
        SubscriptionBuilder sb = new SubscriptionBuilderImpl();
        SubscriptionBuildDirector subscriptionBuildDirector = new SubscriptionBuildDirector(sb);

        address = "742, Evergreen terrace";
        start = LocalDate.of(2018, 1, 1);

        subscription = subscriptionBuildDirector.createAnnualFreeSubscription(start, address);
    }

    @Test
    public void shouldEndSubscriptionAfterYear() {
        assertThat(LocalDate.of(2019, 1, 1), is(subscription.getEnd()));
    }

    @Test
    public void shouldIncludeAdvInFreeSubscription() {
        assertThat(true, is(subscription.isAdvAllowed()));
    }

    @Test
    public void shouldSetPeriodToMonthWhenCreatingAnnualFreeSubscription() {
        assertThat(Period.ofMonths(1), is(subscription.getPeriod()));
    }

    @Test
    public void shouldSetAddressForSubscription() {
        assertThat(address, is(subscription.getAddress()));
    }

    @Test
    public void shouldSetStartForSubscription() {
        assertThat(start, is(subscription.getStart()));
    }

    @Test
    public void shouldSetPriceToZeroForFreeSubscription() {
        assertThat(BigDecimal.ZERO, is(subscription.getPrice()));
    }

}