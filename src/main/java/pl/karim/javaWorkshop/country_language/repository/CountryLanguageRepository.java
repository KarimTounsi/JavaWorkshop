package pl.karim.javaWorkshop.country_language.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.karim.javaWorkshop.country_language.entity.CountryLanguage;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {


    List<CountryLanguage> findByCountryCode(String ContryCode);

}
