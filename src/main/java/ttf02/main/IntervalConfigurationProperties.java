package ttf02.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix="interval-services")
@Data
public class IntervalConfigurationProperties {
	private float min, max;
}
