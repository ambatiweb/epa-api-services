package com.epa.employee.util;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;

import javax.imageio.spi.ServiceRegistry;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Properties;
import java.util.UUID;

public class EmployeeIdGenerator implements IdentifierGenerator, Configurable {
    public static final String GENERATOR_NAME = "employeeIdGenerator";
    public static final String PREFIX_PARAM = "prefix";

    private String prefix = "EPA";


    public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
        this.prefix = params.getProperty(PREFIX_PARAM, "EPA");
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object entityObject) throws HibernateException {
        String uuid = UUID.randomUUID().toString().substring(0, 4);

        return prefix + uuid;
    }
}
