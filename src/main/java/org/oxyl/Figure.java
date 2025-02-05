package org.oxyl;

public interface Figure {
    void deplacer(double distanceX, double distanceY);
    void tourner(double theta);
    default void redimensionner(){};
}
