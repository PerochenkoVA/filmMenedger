package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.ChoiceFilmItem;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Poster {
    private FilmManager manager=new FilmManager ();
    private ChoiceFilmItem first =new ChoiceFilmItem(1,"Bladshot", "triller");
    private ChoiceFilmItem second =new ChoiceFilmItem(2,"Vpered", "mult");
    private ChoiceFilmItem third =new ChoiceFilmItem(3,"Otel 'Belgrad'", "comedy");
    private ChoiceFilmItem fourth =new ChoiceFilmItem(4,"Dgentelmen", "triller");
    private ChoiceFilmItem fifth =new ChoiceFilmItem(5,"Chelovek", "gest");
    private ChoiceFilmItem sixth =new ChoiceFilmItem(6,"Trolli", "mult");
    private ChoiceFilmItem seventh =new ChoiceFilmItem(7,"Nomer odin", "comedy");



    @BeforeEach
    public void setUp(){
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
    }
    @Test
    public void should(){
        FilmManager manager= new FilmManager();

    }
}