package spring.demo.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:sport.properties")
@Configuration
//@ComponentScan("spring.demo.annotation")

public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	
	}
	@Bean
	public Coach swimCoach()
	{
			return new SwimCoach(sadFortuneService());
	}

}
