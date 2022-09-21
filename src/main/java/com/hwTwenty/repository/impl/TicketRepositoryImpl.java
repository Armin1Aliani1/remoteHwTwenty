package com.hwTwenty.repository.impl;

import com.hwTwenty.base.impl.BaseRepositoryImpl;
import com.hwTwenty.domain.Ticket;
import com.hwTwenty.repository.TicketRepository;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket> implements TicketRepository {

    @Override
    public Class<Ticket> getEntityClass() {
        return null;
    }
}
