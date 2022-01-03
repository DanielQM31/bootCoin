package com.bank.bootcoin.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("bootcoin")
public class BootcoinDao {

    @Id
    private String id;
    private String documentType;
    private String number;
    private String cellphone;
    private String email;
    private String balance;
    private String idYanki;
    private String idAssignment;

}
