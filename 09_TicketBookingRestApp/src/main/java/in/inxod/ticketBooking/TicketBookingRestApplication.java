package in.inxod.ticketBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
			info=@Info(
					title="TicketBooking API",
					version="v1.0",
					description="This API will Book and Generate ticket"
					),
			servers=@Server(
					url="http://localhost:8484/inxod",
					description="This App is deployed in the following URL location"
					)
		)
public class TicketBookingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingRestApplication.class, args);
	}

}
