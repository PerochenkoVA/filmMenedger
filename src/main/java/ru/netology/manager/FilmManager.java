package ru.netology.manager;

import ru.netology.domain.ChoiceFilmItem;

import javax.swing.plaf.PanelUI;

public class FilmManager {
    private ChoiceFilmItem [] items = new ChoiceFilmItem[0];

    public void add(ChoiceFilmItem item) {

        int lenght = items.length + 1;
        ChoiceFilmItem[] tmp = new ChoiceFilmItem[lenght];
        System.arraycopy(items,0,tmp,0,items.length);
        int lastIndex=tmp.length-1;
        tmp[lastIndex]=item;
        items=tmp;

    }

    public ChoiceFilmItem[] getAll(){
        ChoiceFilmItem[] result = new ChoiceFilmItem[items.length];
        for (int i =0; i< result.length; i++){
            int index = items.length-1-i;
            result[i] = items[index];
        }
        return result;
    }


}
