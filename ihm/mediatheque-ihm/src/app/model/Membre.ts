import {Avis} from "./Avis";


export interface Membre {
  id: number;
  nom: string;
  prenom: string;
  login: string;
  motDePasse: string;
  isAdmmin: boolean;
  avis: Avis;
}
