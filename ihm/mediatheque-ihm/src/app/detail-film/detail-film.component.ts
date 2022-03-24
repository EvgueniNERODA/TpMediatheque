import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {MediathequeService} from "../rest-services/mediatheque.service";
import {Film} from "../model/Film";

@Component({
  selector: 'app-detail-film',
  templateUrl: './detail-film.component.html',
  styleUrls: ['./detail-film.component.scss']
})

export class DetailFilmComponent implements OnInit {

  private id: any;
  film: Film = <Film>{};



  constructor(private mediathequeService: MediathequeService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.id = +params['id'];
    });
    this.getFilmById(this.id);
  }

  /**
   * Get film from api
   * @param id
   */
  getFilmById (id: number): void {

    this.mediathequeService.getFilmById(id).subscribe(film => this.film = film);
  }

}
