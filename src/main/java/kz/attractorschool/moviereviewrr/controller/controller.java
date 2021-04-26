package kz.attractorschool.moviereviewrr.controller;

import kz.attractorschool.moviereviewrr.model.Movie;
import kz.attractorschool.moviereviewrr.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class controller {
    private  MovieService movieService;

    @GetMapping("/movies")
    public String findAll(Model model){
        List<Movie> movieList =  movieService.findALl();
        model.addAttribute("movies",movieList);
        return "movies";
    }






}
