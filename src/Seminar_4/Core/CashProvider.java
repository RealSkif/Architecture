package Seminar_4.Core;


import Seminar_4.Interfaces.ICarrierRepo;
import Seminar_4.Interfaces.ICashRepo;
import Seminar_4.Models.Carrier;
import Seminar_4.Models.Ticket;
import Seminar_4.Models.User;
import Seminar_4.Services.CarrierRepository;
import Seminar_4.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

private long cardNumber;
private boolean isAutorized;
private ICarrierRepo carrierRepository;
private ICashRepo cashRepository;


    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }




    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    public boolean buy(Ticket ticket)throws RuntimeException {
           Carrier carrier = carrierRepository.read(1);
          return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }


    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {

    }


}
