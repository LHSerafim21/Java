package com.API.Albuns.Repository;

import com.API.Albuns.Model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, String> {

    Album findByIdAlbum(long idAlbum);
}
