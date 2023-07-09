package com.microservice.services;

import com.microservice.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating generateRating(Rating rating);


    //get all ratings
    List<Rating> getAllRatings();

    //get all by UserId
    List<Rating>getRatingByUserId(String userId);

    //get all by hotel
    List<Rating>getRatingByHotelId(String hotelId);

}
