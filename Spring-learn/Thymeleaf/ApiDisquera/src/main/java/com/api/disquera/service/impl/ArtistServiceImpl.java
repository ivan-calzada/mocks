package com.api.disquera.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.api.disquera.model.Artist;
import com.api.disquera.repository.ArtistRepository;
import com.api.disquera.service.ArtistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService{

    @Autowired
    ArtistRepository artist_repo;

    @Override
    public List<Artist> list_artist() {
        // TODO Auto-generated method stub
        Optional<List<Artist>>auxiliar_list_artists=Optional.ofNullable(artist_repo.findAll());

        return auxiliar_list_artists.isPresent()?auxiliar_list_artists.get():Arrays.asList(new Artist());
    }
    
}
