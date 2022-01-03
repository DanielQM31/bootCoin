package com.bank.bootcoin.infraestructure.repository;

import com.bank.bootcoin.infraestructure.model.dao.BootcoinDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBootcoinCrudRepository extends ReactiveCrudRepository<BootcoinDao, String> {
}
