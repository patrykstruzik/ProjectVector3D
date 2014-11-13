package vectors;

/**
 * Klasa służy do reprezentacji wektora w przestrzeni trójwymiarowej
 */
public class Vector3D {
    //pola
    private double x; //współrzędna x wektora
    private double y; //współrzędna y wektora
    private double z; //współrzędna z wektora
    
    //konstruktor
    /**
     * Konstruktor domyślny. Ustawia współrzędne wektora na [1, 0, 0]
     */
    public Vector3D() {
        x=1;
        y=0;
        z=0;
    }//public double
    
    /**
     * Konstruktor tworzy wektor o podanych współrzędnych
     * @param x współrzędna x wektora
     * @param y współrzędna y wektora
     * @param z współrzędna z wektora
     */
    public Vector3D(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }//public Vector3D
    
    /**
     * Konstruktor tworzy wektora na podstawie innego wektora
     * @param anotherVector wektor do skopiowania
     */
    public Vector3D(Vector3D anotherVector) {
        this.x=anotherVector.x;
        this.y=anotherVector.y;
        this.z=anotherVector.z;
    }//public Vector3D
    
    //metody
    /**
     * Metoda oblicza długość wektora
     * @return długość wektora
     */
    public double length() {
        return Math.sqrt(x*x+y*y+z*z);
    }//public double lenght 
    
    /**
     * Metoda dodaje dwa wektory
     * @param anotherVector wektor do dodania
     * @return obliczona suma wektorów
     */
    public Vector3D add(Vector3D anotherVector) {
        return new Vector3D(x+anotherVector.x,
                            y+anotherVector.y,
                            z+anotherVector.z);
    }//public Vector3D
            
    /**
     * Mnoży wektor przez skalar
     * @param alpha liczba, przez którą należy przemnożyć współrzędne wektora
     * @return wektor z pomnożonymi współrzędnymi
     */
    public Vector3D multiplyByScalar(double alpha) {
        return new Vector3D(alpha*x, alpha*y, alpha*z);
    }//public Vector3D multiplyScalar        
    
    /**
     * Oblicza iloczyn skalarny dwóch wektorów
     * @param anotherVector drugi wektor
     * @return obliczony iloczyn skalarny
     */
    public double dotProduct(Vector3D anotherVector) {
        return x*anotherVector.x+y*anotherVector.y+z*anotherVector.z;
    }//public double dotProduct
    
    /**
     * Oblicza iloczyn wektorowy wektorów
     * @param anotherVector drugi wektor
     * @return obliczony iloczyn wektorowy
     */
    public Vector3D crossProduct(Vector3D anotherVector) {
        double newX=y*anotherVector.z-z*anotherVector.y;
        double newY=z*anotherVector.x-x*anotherVector.z;
        double newZ=x*anotherVector.y-y*anotherVector.x;
        return new Vector3D(newX, newY, newZ);
    }//public Vector3D crossProduct
    
    /**
     * Przygotowuje reprezentację łańcuchową obiektu
     * @return łańcuch opisujący wektor w postaci [x, y, z]
     */
    @Override
    public String toString() {
        return "["+x+", "+y+", "+z+"]";
    }//public String toString
            
    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject instanceof Vector3D) {
            Vector3D tmp=(Vector3D)anotherObject;
            return this.x==tmp.x && this.y==tmp.y && this.z==tmp.z;
        } else {
            return false;
        }//else
    }//public boolean equals
    
}//public class Vector3D
