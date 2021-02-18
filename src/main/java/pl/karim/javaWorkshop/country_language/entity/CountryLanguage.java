package pl.karim.javaWorkshop.country_language.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transactional;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class CountryLanguage {


    @Id
    private String language;
    @Column(name = "is_official")
    private boolean official;

    private Double percentage;

    @Column(length = 3)
    private String countryCode;

}
