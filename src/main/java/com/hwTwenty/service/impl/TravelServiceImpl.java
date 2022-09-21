package com.hwTwenty.service.impl;

import com.hwTwenty.base.impl.BaseServiceImpl;
import com.hwTwenty.domain.Travel;
import com.hwTwenty.repository.TravelRepository;
import com.hwTwenty.service.TravelService;

public class TravelServiceImpl extends BaseServiceImpl<Travel, TravelRepository> implements TravelService {

    public TravelServiceImpl(TravelRepository repository) {
        super(repository);
    }
}
