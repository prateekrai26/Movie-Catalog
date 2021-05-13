package com.prateek.ratingsdataservice.resources;

import com.prateek.ratingsdataservice.models.Rating;
import com.prateek.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable String movieId){
      return new Rating(movieId , 5);
    }

    @RequestMapping("/users/{userId}")
   public UserRating getUserRatings(@PathVariable String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234" , 4),
                new Rating("3245" , 9)
        );
        UserRating userRating =new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }





}
