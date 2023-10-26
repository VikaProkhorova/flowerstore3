package ua.edu.ucu.apps.flowerstore.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/flowers")
public class PaymentController {
    @GetMapping("/payments")
	public Boolean paySite(){
		return true;
	}
}

