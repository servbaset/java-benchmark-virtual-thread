package app.raiko.benchmark;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link BenchmarkApplication}.
 */
@Generated
public class BenchmarkApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'benchmarkApplication'.
   */
  public static BeanDefinition getBenchmarkApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BenchmarkApplication.class);
    beanDefinition.setTargetType(BenchmarkApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(BenchmarkApplication.class);
    beanDefinition.setInstanceSupplier(BenchmarkApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
