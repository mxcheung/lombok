package lombok.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestGreeting {

    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        Greeting testGreeting = Greeting.builder()
                .greeting("foo")
                .build();
        assertThat(testGreeting.getGreeting())
        .isEqualTo("foo");
    }

}
