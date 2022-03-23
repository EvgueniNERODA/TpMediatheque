import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CatalogComponent } from './catalog/catalog.component';
import {HttpClientModule} from "@angular/common/http";
import { AddAvisComponent } from './add-avis/add-avis.component';

@NgModule({
  declarations: [
    AppComponent,
    CatalogComponent,
    AddAvisComponent
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
