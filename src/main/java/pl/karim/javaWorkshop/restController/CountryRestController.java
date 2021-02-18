package pl.karim.javaWorkshop.restController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.karim.javaWorkshop.country.entity.Country;
import pl.karim.javaWorkshop.country_language.entity.CountryLanguage;
import pl.karim.javaWorkshop.country_language.service.CountryLanguageService;
import pl.karim.javaWorkshop.country.service.CountryService;
import pl.karim.javaWorkshop.model.ObjectClassCountry;

@RestController
@RequiredArgsConstructor
public class CountryRestController {

    private final CountryService countryService;
    private final CountryLanguageService countryLanguageService;


    @GetMapping("/{code}")
    public ResponseEntity getOne(@PathVariable String code) {


            Country country = countryService.getByCode(code);
            CountryLanguage countryLanguage = countryLanguageService.getByCountryCodeAndOfficialTrue(code);

            return ResponseEntity.ok(new ObjectClassCountry(country.getName(), country.getContinent(), country.getPopulation(), country.getLifeExpectancy().intValue() , countryLanguage.getLanguage()));

    }



}
