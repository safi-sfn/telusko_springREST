package in.inxod.ticketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.inxod.ticketBooking.model.Passenger;

@Repository
public interface TicketRepository extends JpaRepository<Passenger, Integer> {

}
