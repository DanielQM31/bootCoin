package com.bank.bootcoin.infraestructure.repository;

import com.bank.bootcoin.application.model.BootcoinRepository;
import com.bank.bootcoin.domain.Bootcoin;
import com.bank.bootcoin.infraestructure.model.dao.BootcoinDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class BootcoinCrudRepository implements BootcoinRepository {

    @Autowired
    IBootcoinCrudRepository repository;

    @Override
    public Flux<Bootcoin> findAll() {
        return repository.findAll()
                .map(this::mapBootcoinDaoToBootcoin);
    }

    @Override
    public Mono<Bootcoin> findById(String id) {
        return repository.findById(id)
                .map(this::mapBootcoinDaoToBootcoin);
    }

    @Override
    public Mono<Bootcoin> save(Bootcoin bootcoin) {
        return repository.save(mapBootcoinToBootcoinDao(bootcoin))
                .map(this::mapBootcoinDaoToBootcoin);
    }

    @Override
    public Mono<Bootcoin> update(String id, Bootcoin bootcoin) {
        return repository.save(mapBootcoinToBootcoinDao(bootcoin))
                .map(this::mapBootcoinDaoToBootcoin);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    private Bootcoin mapBootcoinDaoToBootcoin(BootcoinDao bootcoinDao){
        Bootcoin bootcoin = new Bootcoin();
        BeanUtils.copyProperties(bootcoinDao, bootcoin);
        return bootcoin;
    }

    private BootcoinDao mapBootcoinToBootcoinDao(Bootcoin bootcoin){
        BootcoinDao bootcoinDao = new BootcoinDao();
        BeanUtils.copyProperties(bootcoin, bootcoinDao);
        return bootcoinDao;
    }

}
