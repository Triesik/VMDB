package com.vmdb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/v1/movie/getMovies")
    public String getMovies() {
        return "List of movies";
    }

    @PostMapping("/v1/movie/addMovie")
    public String addMovie() {
        return "Movie has been added";
    }

}