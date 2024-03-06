package ttf02.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("interval-service")
public class IntervalServiceController {
	
	@Autowired
	IntervalConfigurationProperties cfg;
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class IntervalResult {
		private float min, max, perc, value;
	}
	
	@GetMapping("interval")
	public IntervalResult interval(float percentage) {
		IntervalResult res = new IntervalResult();
		res.setMin(9);
		res.setMax(12);
		res.setPerc(percentage);
		res.setValue(res.getMin() + (res.getMax()-res.getMin()) * percentage/100);
		return res;
	}
}
