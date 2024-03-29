package org.example.lab1.Dao;

import org.springframework.stereotype.Service;

@Service
public class NumberDao {
    private final NumberRepository numberRepository;


    public NumberDao(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    public NumberEntity saveEntity(NumberEntity numberEntity){
        return numberRepository.save(numberEntity);
    }
}
