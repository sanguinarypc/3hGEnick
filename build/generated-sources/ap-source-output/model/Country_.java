package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Coviddata;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-07T01:47:44")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, Integer> country;
    public static volatile SingularAttribute<Country, Double> long1;
    public static volatile SingularAttribute<Country, String> name;
    public static volatile ListAttribute<Country, Coviddata> coviddataList;
    public static volatile SingularAttribute<Country, Double> lat;

}