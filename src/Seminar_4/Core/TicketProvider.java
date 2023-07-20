package Seminar_4.Core;


import Seminar_4.Interfaces.ITicketRepo;
import Seminar_4.Models.Ticket;
import Seminar_4.Services.TicketRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {
    private ITicketRepo ticketRepo;

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    public ITicketRepo getTicketRepo() {
        return ticketRepo;
    }

    public boolean updateTicketRepo(Ticket ticket) {
        return true;
    }

    public void setTicketRepo(ITicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }




    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */
    public Ticket[] getTickets(int routeNumber) throws RuntimeException {
        return new Ticket[routeNumber];
    }

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }}
