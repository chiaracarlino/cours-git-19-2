package org.oxyl;

public class AUnCentre {
    protected Point centre;

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public boolean isAuCentre(){
        return centre.getX() == 0 && centre.getY() == 0;
    }
}


/* ceci est la classe mère */
/* bonjour */