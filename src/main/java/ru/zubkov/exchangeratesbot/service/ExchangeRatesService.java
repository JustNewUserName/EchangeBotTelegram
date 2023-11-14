package ru.zubkov.exchangeratesbot.service;

import ru.zubkov.exchangeratesbot.exception.ServiceException;

public interface ExchangeRatesService {

    String getUSDExchangeRate() throws ServiceException;

    String getEURExchangeRate() throws ServiceException;

    String getCADExchangeRate() throws ServiceException;

    void clearUSDCache();

    void clearEURCache();
    void clearCADCache();

}
