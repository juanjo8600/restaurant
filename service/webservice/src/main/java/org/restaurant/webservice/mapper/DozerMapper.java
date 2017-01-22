package org.restaurant.webservice.mapper;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by juanjose on 22/1/17.
 */
@Component
public class DozerMapper implements MapperService {

    Mapper mapper = new DozerBeanMapper();

    @Override
    public Object map(Object origin, Class destination) {
        return mapper.map(origin, destination);
    }
}
