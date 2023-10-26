package ua.edu.ucu.apps.flowerstore.store;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
	public List<Flower> getFlowers(){
		return List.of(new Flower(FlowerType.ROSE, FlowerColor.RED, 0.8, 45));
	}
}
