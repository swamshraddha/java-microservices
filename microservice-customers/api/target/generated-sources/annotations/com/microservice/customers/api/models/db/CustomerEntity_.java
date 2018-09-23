package com.microservice.customers.api.models.db;

import com.microservice.customers.api.models.db.common.BaseEntity_;
import com.microservice.customers.lib.v1.CustomerStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-09-23T17:32:28")
@StaticMetamodel(CustomerEntity.class)
public class CustomerEntity_ extends BaseEntity_ {

    public static volatile SingularAttribute<CustomerEntity, String> firstName;
    public static volatile SingularAttribute<CustomerEntity, String> lastName;
    public static volatile SingularAttribute<CustomerEntity, Date> dateOfBirth;
    public static volatile SingularAttribute<CustomerEntity, String> email;
    public static volatile SingularAttribute<CustomerEntity, CustomerStatus> status;

}