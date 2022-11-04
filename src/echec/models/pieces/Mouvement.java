package echec.models.pieces;

import echec.models.plateau.Position;

import java.util.List;

interface Mouvement {

    List<Position> getMouvementPossible();

}
