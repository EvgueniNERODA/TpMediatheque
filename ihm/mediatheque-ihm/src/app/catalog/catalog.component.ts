import { Component, OnInit } from '@angular/core';
import {Film} from "../model/Film";
import {MediathequeService} from "../rest-services/mediatheque.service";
import {Membre} from "../model/Membre";
import {Router} from "@angular/router";

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.scss']
})
export class CatalogComponent implements OnInit {

  films: Film[] = [];
  membres: Membre[] = [];

  constructor(private mediathequeService: MediathequeService, private router: Router) { }

  ngOnInit(): void {
    this.getFilms();

  }

  getFilms(): void {
    this.mediathequeService.getFilms()
      .subscribe(films => this.films = films);
    console.log("Films"  + this.films.length)
  }

  getMembres(): void {
    this.mediathequeService.getMembres()
      .subscribe(membres => this.membres = membres);
    console.log("Films"  + this.membres.length)
  }

  gotoList() {
    this.router.navigate(['/detail-film']);
  }
}
