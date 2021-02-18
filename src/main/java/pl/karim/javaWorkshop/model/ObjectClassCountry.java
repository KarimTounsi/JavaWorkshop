package pl.karim.javaWorkshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.transaction.Transactional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class ObjectClassCountry {

    private String name;

    private String continent;

    private Integer population;

    private Integer life_expectancy;

    private String Country_language;


}
