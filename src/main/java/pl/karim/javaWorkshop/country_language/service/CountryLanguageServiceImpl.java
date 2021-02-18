package pl.karim.javaWorkshop.country_language.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.karim.javaWorkshop.country_language.entity.CountryLanguage;
import pl.karim.javaWorkshop.country_language.repository.CountryLanguageRepository;

import javax.transaction.Transactional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
@Transactional
public class CountryLanguageServiceImpl implements CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;


    @Override
    public CountryLanguage getByCountryCodeAndOfficialTrue(String contryCode) {
        return countryLanguageRepository.findByCountryCode(contryCode).stream().filter(CountryLanguage::isOfficial).collect(Collectors.toList()).get(0);
    }


}
