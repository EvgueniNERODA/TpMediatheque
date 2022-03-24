import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { AddAvisComponent } from './add-avis/add-avis.component';
import { DetailFilmComponent } from './detail-film/detail-film.component';
import {CatalogComponent} from "./catalog/catalog.component";



@NgModule({
  declarations: [
    AppComponent,
    CatalogComponent,
    AddAvisComponent,
    DetailFilmComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
