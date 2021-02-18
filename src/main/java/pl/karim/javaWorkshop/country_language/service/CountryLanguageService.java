package pl.karim.javaWorkshop.country_language.service;

import pl.karim.javaWorkshop.country_language.entity.CountryLanguage;

public interface CountryLanguageService {


    CountryLanguage getByCountryCodeAndOfficialTrue(String contryCode);




}
