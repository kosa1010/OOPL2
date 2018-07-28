/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl2.zad1;

/**
 *
 * @author mchyl
 */
public interface QuadraticEquationInterface {
    
    public void setA(int a);
    public void setB(int b);
    public void setC(int c);
    
    public double countDiscriminant(int a, int b, int c);
    public double[] countRoot(int a, int b, double delta);
}
