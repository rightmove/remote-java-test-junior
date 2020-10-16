package com.rightmove.property;

import com.rightmove.property.data.PropertyEntity;

import java.util.List;

public interface PropertyService {
    List<PropertyEntity> search(String postcode);
}
