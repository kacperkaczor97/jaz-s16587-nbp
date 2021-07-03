package com.example.jazs16587nbp.service;

import com.example.jazs16587nbp.model.Rate;
import com.example.jazs16587nbp.model.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NBPService {

    private RestTemplate restTemplate;

    public NBPService(RestTemplate restTemplate) { this.restTemplate = restTemplate; }

    public Double getValue(String currency, String firstDate, String secondDate) {
        System.out.println(String
                .format("http://api.nbp.pl/api/exchangerates/rates/a/%s/%s/%s/", currency, firstDate,
                        secondDate));
        List<Rate> rates = restTemplate.getForEntity(String
                .format("http://api.nbp.pl/api/exchangerates/rates/a/%s/%s/%s/", currency, firstDate,
                        secondDate), Root.class).getBody().getRates();

        double suma = 0;

        for (Rate rate : rates) {
            suma += Double.parseDouble(rate.getMid());
        }

        return suma / (double) rates.size();
    }

}
