package Notes;

public class Notes {

}


// IOC -> Inversion of Control prensibi 2 ye ayrilir
// 1 - DI -> dependency injection
// - > Setter Injection
// - > Constructor Injection
// - > Field Injection
// 2 - Dependency Lookup
// - > Dependecy Pool
// - > CDL(Contextualized Dependency Lookup)

// Dependency Pool tekniginde bagimliliklar/dependencyler gerektigi noktada registrydan cekilir
// EJBlerde bu teknik kullanilmaktadir.
// JNDI lookup islemleri ornek verilebilir.
// https://tomcat.apache.org/tomcat-8.0-doc/jndi-datasource-examples-howto.html

// Springte de bu yakalsim desteklenir.
// burada dependecy lookup yapmaktayiz.
// MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);

// ------------------------------------
// Constructor Injection
// dependencyler constructor kullanilarak inject edilir.

// Setter Injection
// dependencyler java-bean style setter method uzerinden inject edilir.

/// org.springframework.beans.factory.BeanFactory
    /*
     * The core of Spring’s dependency injection container is the BeanFactory
     * interface. BeanFactory is responsible for managing components, including
     * their dependencies as well as their life cycles. In Spring, the term bean is
     * used to refer to any component managed by the container.
     */

// Dependency injection core interface'si BeanFactory
// BeanFactory , dependencylerin yonetiminden , yasam dongusunden sorumlu.
// Spring container tarafindan yonetilen objeler -> bean

///////////////////////////////
//  org.springframework.context.ApplicationContext
    /*
     * In Spring, the ApplicationContext interface is an extension to BeanFactory.
     * In addition to DI services, ApplicationContext provides other services, such
     * as transaction and AOP service, message source for internationalization
     * (i18n), and application event handling, to name a few
     */

/// ----------------------

// Java Based configuration ->
// @Configuration ve @Bean annotationdan faydalaniriz.
// @Configruation ile isaretledigimiz siniflarda @Bean annotationi kullandigimiz metotlar otomatik olarak Spring IOC container tarafindan cagrilip calistirilacaktir.
    /*
     * Such a configuration class is annotated with @Configuration and contains
     * methods annotated with @Bean that are called directly by the Spring IoC
     * container to instantiate the beans. The bean name will be the same as the
     * name of the method used to create it.
     */

// metodun adi ile bean "name" ayni olacaktir.
//@Bean
//public Vehicle car() {
//	//return new Car();
//	Car car = new Car();
//	car.setWheel(lassa());
//	return car;
//}



