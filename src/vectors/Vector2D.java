package vectors;

/**
 * Klasa służy do reprezentacji wektora w przestrzeni dwuwymiarowej
 */
public class Vector2D {
    //pola
    private double x; //współrzędna x wektora
    private double y; //współrzędna y wektora

    
    //konstruktor
    /**
     * Konstruktor domyślny. Ustawia współrzędne wektora na [1, 0]
     */
    public Vector2D() {
        x=1;
        y=0;
    }//public double
    
    /**
     * Konstruktor tworzy wektor o podanych współrzędnych
     * @param x współrzędna x wektora
     * @param y współrzędna y wektora
     */
    public Vector2D(double x, double y) {
        this.x=x;
        this.y=y;
    }//public Vector2D
    
    /**
     * Konstruktor tworzy wektora na podstawie innego wektora
     * @param anotherVector wektor do skopiowania
     */
    public Vector2D(Vector2D anotherVector) {
        this.x=anotherVector.x;
        this.y=anotherVector.y;
    }//public Vector2D
    
    //metody
    /**
     * Metoda oblicza długość wektora
     * @return długość wektora
     */
    public double length() {
        return Math.sqrt(x*x+y*y);
    }//public double lenght 
    
    /**
     * Metoda dodaje dwa wektory
     * @param anotherVector wektor do dodania
     * @return obliczona suma wektorów
     */
    public Vector2D add(Vector2D anotherVector) {
        return new Vector2D(x+anotherVector.x,
                            y+anotherVector.y);
    }//public Vector2D add
            
    /**
     * Mnoży wektor przez skalar
     * @param alpha liczba, przez którą należy przemnożyć współrzędne wektora
     * @return wektor z pomnożonymi współrzędnymi
     */
    public Vector2D multiplyByScalar(double alpha) {
        return new Vector2D(alpha*x, alpha*y);
    }//public Vector2D multiplyScalar        
    
    /**
     * Oblicza iloczyn skalarny dwóch wektorów
     * @param anotherVector drugi wektor
     * @return obliczony iloczyn skalarny
     */
    public double dotProduct(Vector2D anotherVector) {
        return x*anotherVector.x+y*anotherVector.y;
    }//public double dotProduct
    
   /**
     * Przygotowuje reprezentację łańcuchową obiektu
     * @return łańcuch opisujący wektor w postaci [x, y]
     */
    @Override
    public String toString() {
        return "["+x+", "+y+"]";
    }//public String toString
    
    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject instanceof Vector2D) {
            Vector2D tmp=(Vector2D)anotherObject;
            return this.x==tmp.x && this.y==tmp.y;
        } else {
            return false;
        }//else
    }//public boolean equals
            
}//public class Vector2D
