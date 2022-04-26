package com.rudy.ryanto.redisom.init;

import com.rudy.ryanto.redisom.domain.SearchboxModel;
import com.rudy.ryanto.redisom.repository.SearchboxModelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(1)
public class LoadData implements CommandLineRunner {

    @Autowired
    SearchboxModelRepository repository;

    @Override
    public void run(String... args) throws Exception {
        log.info("repo delAll...{}");
        repository.deleteAll();
        SearchboxModel s = SearchboxModel.of("1","Nasi Goreng, Bakso, Mie Ayam, Soto","Makanan Indonesia",1,1,0);
        log.info("build data and save!");
        repository.save(s);
    }
}
