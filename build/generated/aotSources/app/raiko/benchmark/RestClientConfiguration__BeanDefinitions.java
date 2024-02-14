package app.raiko.benchmark;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.web.client.RestClient;

/**
 * Bean definitions for {@link RestClientConfiguration}.
 */
@Generated
public class RestClientConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restClientConfiguration'.
   */
  public static BeanDefinition getRestClientConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestClientConfiguration.class);
    beanDefinition.setTargetType(RestClientConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(RestClientConfiguration.class);
    InstanceSupplier<RestClientConfiguration> instanceSupplier = InstanceSupplier.using(RestClientConfiguration$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(RestClientConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'restClient'.
   */
  private static BeanInstanceSupplier<RestClient> getRestClientInstanceSupplier() {
    return BeanInstanceSupplier.<RestClient>forFactoryMethod(RestClientConfiguration.class, "restClient")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RestClientConfiguration.class).restClient());
  }

  /**
   * Get the bean definition for 'restClient'.
   */
  public static BeanDefinition getRestClientBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestClient.class);
    beanDefinition.setInstanceSupplier(getRestClientInstanceSupplier());
    return beanDefinition;
  }
}
