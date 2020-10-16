package com.rightmove.property;

import com.rightmove.property.data.PropertyDao;
import com.rightmove.property.data.PropertyEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyDao propertyDao;

    public PropertyServiceImpl(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }

    //TODO finish implementing method

    @Override
    public List<PropertyEntity> search(String postcode) {
        return Collections.emptyList();
    }

}
