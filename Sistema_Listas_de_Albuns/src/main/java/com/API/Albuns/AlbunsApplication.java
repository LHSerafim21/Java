package com.API.Albuns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.API.Albuns.Repository.AlbumRepository", "com.API.Albuns.Repository.UsuarioRepository"})
//@ComponentScan(basePackages = {"com.API.Albuns.Configurations.*"})
//@EntityScan(basePackages = {"com.API.Albuns.Model.*"})
public class AlbunsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlbunsApplication.class, args);
    }
}
