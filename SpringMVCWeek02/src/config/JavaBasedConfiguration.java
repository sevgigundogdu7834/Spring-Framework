package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
// <mvc:annotation-driven>
// @EnableWebMvc arka planda Spring MVC için kullanacağımız birçok annotationu aktif hale getirir.
// Bu nedenle kullanmamız gereklidir.
@ComponentScan(basePackages= {"controller","service"})
// <context:component-scan base-package="controller,service"/>
public class JavaBasedConfiguration implements WebMvcConfigurer {
	
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view.pages/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
		
	}

}
