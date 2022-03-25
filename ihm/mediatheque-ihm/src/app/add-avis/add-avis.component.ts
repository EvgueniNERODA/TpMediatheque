import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import {Avis} from "../model/Avis";
import {MediathequeService} from "../rest-services/mediatheque.service";
import {Genre} from "../model/Genre";

@Component({
  selector: 'app-add-avis',
  templateUrl: './add-avis.component.html',
  styleUrls: ['./add-avis.component.scss']
})
export class AddAvisComponent implements OnInit {

  name = new FormControl('');
  genres: Genre [] = [];

  constructor(private mediathequeService: MediathequeService) { }

  ngOnInit(): void {
    this.getGenres();
  }

  getGenres(): void {
    this.mediathequeService.getGenres().subscribe(genres => this.genres = genres);
  }

}
