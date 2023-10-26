package ua.edu.ucu.apps.flowerstore.delivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/flowers")
public class DeliveryController {
    @GetMapping("/delivery")
	public Boolean deliveryItem(){
		return true;
	}
}
