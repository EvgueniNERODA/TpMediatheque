import {Acteur} from "./Acteur";
import {Genre} from "./Genre";
import {Avis} from "./Avis";

export interface Film {
  id: number;
  titre: string;
  annee: number;
  duree: number;
  synopsys: string;
  acteurs: Acteur [];
  realsateur: Acteur;
  genre: Genre [];
  avisList: Avis [];
}
