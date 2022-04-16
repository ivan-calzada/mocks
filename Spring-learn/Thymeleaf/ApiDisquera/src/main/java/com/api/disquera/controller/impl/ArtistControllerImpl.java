package com.api.disquera.controller.impl;

import java.util.List;
import java.util.Optional;

import com.api.disquera.controller.ArtistController;
import com.api.disquera.model.Artist;
import com.api.disquera.service.ArtistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistControllerImpl implements ArtistController{

    @Autowired
    ArtistService artist_service;

    @Override
    public ResponseEntity<?> get_artists() {
        // TODO Auto-generated method stub
        ResponseEntity response=null;
        Optional<List<Artist>>auxiliar_artists_response;
        try {
            auxiliar_artists_response=Optional.ofNullable(artist_service.list_artist());
            if (auxiliar_artists_response.isPresent()) {
                auxiliar_artists_response.get().forEach(System.out::println);
                response=ResponseEntity.ok(auxiliar_artists_response.get());
            } else {
                response=ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            //TODO: handle exception
            response=ResponseEntity.internalServerError().body(e);
        }
        return response;
    }
    
}
