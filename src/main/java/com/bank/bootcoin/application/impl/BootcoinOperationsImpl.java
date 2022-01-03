package com.bank.bootcoin.application.impl;

import com.bank.bootcoin.application.BootcoinOperations;
import com.bank.bootcoin.application.model.BootcoinRepository;
import com.bank.bootcoin.domain.Bootcoin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BootcoinOperationsImpl implements BootcoinOperations {

    private final BootcoinRepository repository;


    @Override
    public Flux<Bootcoin> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Bootcoin> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Bootcoin> save(Bootcoin bootcoin) {
        return repository.save(bootcoin);
    }

    @Override    public Mono<Bootcoin> update(String id, Bootcoin bootcoin) {
        return repository.update(id, bootcoin);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
