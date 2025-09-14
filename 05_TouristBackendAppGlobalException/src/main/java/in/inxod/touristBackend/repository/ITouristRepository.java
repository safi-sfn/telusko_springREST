package in.inxod.touristBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.inxod.touristBackend.model.Tourist;

@Repository
public interface ITouristRepository extends JpaRepository<Tourist, Integer> {

}
