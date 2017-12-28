package com.maryanto.dimas.example.demohttpclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoHttpClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHttpClientApplication.class, args);
    }

    @Data
    @AllArgsConstructor
    public class Mahasiswa {
        private String nim;
        private String nama;
        private LocalDateTime createDate;
    }

    @RestController
    @RequestMapping("/api")
    public class MahasiswController {

        @GetMapping("/mahasiswa/list")
        public List<Mahasiswa> listMahasiswa() {
            return Arrays.asList(
                    new Mahasiswa("10511148", "Dimas Maryanto", LocalDateTime.now()),
                    new Mahasiswa("10511150", "Riansayah Permana Putra", LocalDateTime.now()));
        }

    }
}
