package pl.karim.javaWorkshop.country.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class Country {


    @Id
    @Column(length = 3)
    private String code ;

    private String name;

    private String continent;

    private String region;

    private Integer surfaceArea;

    private Integer indepYear;

    private Integer population;

    private Double lifeExpectancy;

    private Double gnpOld;

    private String localName;

    private String governmentForm;

    private String HeadOfState;

    private Integer capital;

    private String code2 ;


}
