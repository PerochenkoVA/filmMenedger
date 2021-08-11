package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class ChoiceFilmItem {
    private int image;
    private String nameFilm;
    private String genre;

}
