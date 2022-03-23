import {Film} from "./Film";

export interface Acteur {
  id: number;
  nom: string;
  prenom: string;
  filmList: Film [];
}
