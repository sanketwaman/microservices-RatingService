package com.microservice.controllers;

import com.microservice.entities.Rating;
import com.microservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating>createRating(@RequestBody Rating rating){

        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.generateRating(rating));
    }
    @GetMapping
    public ResponseEntity<List<Rating>>getRatings(){
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Rating>>getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<List<Rating>>S(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
}
