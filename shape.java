/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangular1;

import java.util.Random;

/**
 *
 * @author douyo
 */
public class Rectangular1 {
    
    private int width;
    private int length;
    private static int numOfSide = 4;

    
    public Rectangular() {
        int min = 1;
        int max = 10;
        Random rand = new Random();
        this.width = rand.nextInt(max - min + 1) + min;      
        this.length = rand.nextInt(max - min + 1) + min;
    }
    
    
    public Rectangular(int width, int length) {
        this.width = width;
        this.length = length;
    }
    
    
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
    }
    
 
    public int calcArea() {
        return width * length;
    }
    
  
    public int calcPerimeter() {
        return (width + length) * 2;
    }
    
  
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width && this.length == rectangular.length;
    }

  
    @Override
    public String toString() {    
        String str = "";
        
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Length", length);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
        
        return str;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
