package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import structures.Sarcina;

public interface SarcinaRepository extends JpaRepository<Sarcina, Integer> {
}