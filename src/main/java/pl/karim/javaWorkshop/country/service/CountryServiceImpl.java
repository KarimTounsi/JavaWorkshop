package pl.karim.javaWorkshop.country.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.karim.javaWorkshop.country.entity.Country;
import pl.karim.javaWorkshop.exceptions.ObjectNotFoundException;
import pl.karim.javaWorkshop.country.repository.CountryRepository;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;


    @Override
    public Country getByCode(String code) {


        if (countryRepository.findByCode(code) != null){
            return countryRepository.findByCode(code);
        } else throw new ObjectNotFoundException("INVALID_COUNTRY_CODE");


    }


}
