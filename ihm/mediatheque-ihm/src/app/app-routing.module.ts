import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailFilmComponent } from './detail-film/detail-film.component';
import {CatalogComponent} from "./catalog/catalog.component";
import {AddAvisComponent} from "./add-avis/add-avis.component";

const routes: Routes = [{ path: 'detail-film/:id', component: DetailFilmComponent },
                        { path: 'catalog', component: CatalogComponent },
                        { path: 'add-avis', component: AddAvisComponent },
                       ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
