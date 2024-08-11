package constants;

import java.time.Duration;

public class Environment {
    public static final class Timeouts {
        public static final Duration IMPLICIT_TIMEOUT = Duration.ofMillis(5000);
        public static final Duration EXPLICIT_TIMEOUT = Duration.ofMillis(10000);

    }
}
