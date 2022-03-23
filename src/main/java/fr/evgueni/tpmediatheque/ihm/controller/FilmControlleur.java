package fr.evgueni.tpmediatheque.ihm.controller;

import fr.evgueni.tpmediatheque.bll.BLLManager;
import fr.evgueni.tpmediatheque.bo.Avis;
import fr.evgueni.tpmediatheque.bo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FilmControlleur {

    @Autowired
    BLLManager bllManager;

    @GetMapping(value = "catalog")
    public String getCatalog (Model model){


        model.addAttribute("movies", bllManager.getFilmManager().selectAllFilm());

        return "films/films-catalog";
    }

    @GetMapping(value = "/film/{id}")
    public String getFilmById (Model model, @PathVariable long id) {

        model.addAttribute("film",bllManager.getFilmManager().getFilmById(id));

        return "films/page-film";

    }

    @GetMapping(value = "/addFilm")
    public String showAddFilmPage(Model model) {

        model.addAttribute("film", new Film());

        return "films/add-film-form";
    }


    @PostMapping(value = "/addFilm")
    public String addFilm (Model model, @ModelAttribute("film") Film film){

        model.addAttribute("film", bllManager.getFilmManager().addFilm(film) );
        System.out.println("TestFilm"+film.getTitre());
        return "redirect:/catalog";
    }

    @GetMapping(value = "/addAvis/{id}")
    public String showAddAvisPage(Model model, @PathVariable long id) {

        model.addAttribute("avis", new Avis());

        return "films/add-avis-form";
    }
}
