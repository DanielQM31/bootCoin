package com.bank.bootcoin.application.model;

import com.bank.bootcoin.domain.Bootcoin;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootcoinRepository {

    public Flux<Bootcoin> findAll();
    public Mono<Bootcoin> findById(String id);
    public Mono<Bootcoin> save(Bootcoin bootcoin);
    public Mono<Bootcoin> update(String id, Bootcoin bootcoin);

    public Mono<Void> delete(String id);

}
