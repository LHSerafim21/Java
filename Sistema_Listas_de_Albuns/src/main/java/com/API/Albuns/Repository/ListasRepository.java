package com.API.Albuns.Repository;

import com.API.Albuns.Model.Album;
import com.API.Albuns.Model.Lista;
import org.springframework.data.repository.CrudRepository;

public interface ListasRepository extends CrudRepository<Lista, String> {

    Lista findByIdLista(Integer idLista);
}
