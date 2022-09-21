package com.hwTwenty.repository.impl;

import com.hwTwenty.base.impl.BaseRepositoryImpl;
import com.hwTwenty.domain.Travel;
import com.hwTwenty.repository.TravelRepository;

public class TravelRepositoryImpl extends BaseRepositoryImpl<Travel> implements TravelRepository {
    @Override
    public Class<Travel> getEntityClass() {
        return null;
    }
}
