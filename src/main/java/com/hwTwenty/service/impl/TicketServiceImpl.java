package com.hwTwenty.service.impl;

import com.hwTwenty.base.impl.BaseServiceImpl;
import com.hwTwenty.domain.Ticket;
import com.hwTwenty.repository.TicketRepository;
import com.hwTwenty.service.TicketService;

public class TicketServiceImpl extends BaseServiceImpl<Ticket, TicketRepository> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }
}
