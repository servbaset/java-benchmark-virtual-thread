package app.raiko.benchmark;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RestClientConfiguration}.
 */
@Generated
public class RestClientConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RestClientConfiguration apply(RegisteredBean registeredBean,
      RestClientConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("waitingServer").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
