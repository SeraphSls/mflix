package br.com.mflix.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MflixController {


    @GetMapping(value = "/mflix")
    public ResponseEntity<String> getMflix(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
