package com.api.disquera.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface ArtistController {
    
    @GetMapping("/artist/list_artists")
    public ResponseEntity<?> get_artists();
}
