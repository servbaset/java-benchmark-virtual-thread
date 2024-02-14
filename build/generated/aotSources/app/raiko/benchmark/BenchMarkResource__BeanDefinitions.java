package app.raiko.benchmark;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.client.RestClient;

/**
 * Bean definitions for {@link BenchMarkResource}.
 */
@Generated
public class BenchMarkResource__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'benchMarkResource'.
   */
  private static BeanInstanceSupplier<BenchMarkResource> getBenchMarkResourceInstanceSupplier() {
    return BeanInstanceSupplier.<BenchMarkResource>forConstructor(RestClient.class)
            .withGenerator((registeredBean, args) -> new BenchMarkResource(args.get(0)));
  }

  /**
   * Get the bean definition for 'benchMarkResource'.
   */
  public static BeanDefinition getBenchMarkResourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BenchMarkResource.class);
    beanDefinition.setInstanceSupplier(getBenchMarkResourceInstanceSupplier());
    return beanDefinition;
  }
}
