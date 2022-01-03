package com.bank.bootcoin.infraestructure.rest;

import com.bank.bootcoin.application.BootcoinOperations;
import com.bank.bootcoin.domain.Bootcoin;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/bootcoin")
@RequiredArgsConstructor
public class BootcoinController {

    private final BootcoinOperations bootcoinOperations;

    @GetMapping
    public Flux<Bootcoin> get() {
        return bootcoinOperations.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Bootcoin> getId(@PathVariable String id) {
        return bootcoinOperations.findById(id);
    }

    @PostMapping("/add")
    public Mono<Bootcoin> post(@RequestBody Bootcoin bootcoin) {
        return bootcoinOperations.save(bootcoin);
    }

    @PutMapping("/{id}")
    public Mono<Bootcoin> put(@PathVariable String id, @RequestBody Bootcoin bootcoin) {
        return bootcoinOperations.update(id, bootcoin);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return bootcoinOperations.delete(id);
    }

}
