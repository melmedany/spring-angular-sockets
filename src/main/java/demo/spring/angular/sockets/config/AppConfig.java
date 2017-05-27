package demo.spring.angular.sockets.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "demo.spring.angular.sockets", excludeFilters = {
		@ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
		@ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION) })
public class AppConfig {

}
