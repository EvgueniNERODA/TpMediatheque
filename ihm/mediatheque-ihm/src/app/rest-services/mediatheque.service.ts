
import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import {Observable, of} from "rxjs";
import { catchError, tap } from 'rxjs/operators';
import {Film} from "../model/Film";
import {MessageService} from "./message.service";
import {environment} from "./environnement";
import {Membre} from "../model/Membre";

@Injectable({
  providedIn: 'root'
})
export class MediathequeService {

  // private heroesUrl = 'http://localhost:8080/films';  // URL to web api
  private heroesUrl = environment.apiBaseUrl;


  constructor(
    private http: HttpClient,
    private messageService: MessageService) { }

/** Log a HeroService message with the MessageService */
private log(message: string) {
  this.messageService.add(`HeroService: ${message}`);
}

  /** GET heroes from the server */
  getFilms(): Observable<Film[]> {
    return this.http.get<Film[]>('/api/films').pipe(
      catchError(this.handleError<Film[]>('getFilms', []))
    );
  }

  /** GET membres from the server */
  getMembres(): Observable<Membre[]> {
    console.log("URL" + this.heroesUrl);
    return this.http.get<Membre[]>(this.heroesUrl).pipe(
      catchError(this.handleError<Membre[]>('getMembres', []))
    );

  }

  /** GET hero by id. Will 404 if id not found */
  getHero(id: number): Observable<Film> {
    const url = `${this.heroesUrl}/${id}`;
    return this.http.get<Film>(url).pipe(
      tap(_ => this.log(`fetched hero id=${id}`)),
      catchError(this.handleError<Film>(`getHero id=${id}`))
    );
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   *
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
