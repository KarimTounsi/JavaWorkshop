package pl.karim.javaWorkshop.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.karim.javaWorkshop.country.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCode(String code);

}
