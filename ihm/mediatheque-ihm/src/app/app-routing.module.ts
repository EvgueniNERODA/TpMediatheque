import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailFilmComponent } from './detail-film/detail-film.component';
import {CatalogComponent} from "./catalog/catalog.component";

const routes: Routes = [{ path: 'detail-film/:id', component: DetailFilmComponent },
                        { path: 'catalog', component: CatalogComponent },
                       ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
