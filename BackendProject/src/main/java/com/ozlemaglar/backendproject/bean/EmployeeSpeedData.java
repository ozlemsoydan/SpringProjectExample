package com.ozlemaglar.backendproject.bean;


import com.ozlemaglar.backendproject.business.dto.EmployeeDto;
import com.ozlemaglar.backendproject.business.service.impl.EmployeeServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.CommonDataSource;
import java.util.UUID;

@Configuration
public class EmployeeSpeedData {


    @Bean
    CommandLineRunner createEmployeeData(EmployeeServiceImpl service){
        return (args)->{
            for (int i = 1; i <5 ; i++) {
                UUID uuid= UUID.randomUUID();
                EmployeeDto employeeDto = EmployeeDto.builder()
                        .email(uuid+ "@gmail.com")
                        .password("root"+i)
                        .username("özlem ağlar"+i)
                        .price(10*i).build();
                service.createEmployee(employeeDto);
            }

        };
    }

}
