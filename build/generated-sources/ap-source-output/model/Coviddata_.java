package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Country;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-07T01:47:44")
@StaticMetamodel(Coviddata.class)
public class Coviddata_ { 

    public static volatile SingularAttribute<Coviddata, Country> country;
    public static volatile SingularAttribute<Coviddata, Short> datakind;
    public static volatile SingularAttribute<Coviddata, Date> trndate;
    public static volatile SingularAttribute<Coviddata, Integer> qty;
    public static volatile SingularAttribute<Coviddata, Integer> coviddata;
    public static volatile SingularAttribute<Coviddata, Integer> proodqty;

}