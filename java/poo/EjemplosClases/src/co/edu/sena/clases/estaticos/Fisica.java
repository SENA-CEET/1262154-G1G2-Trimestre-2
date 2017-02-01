/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.estaticos;

/**
 *
 * @author Enrique
 */
public final class Fisica {
    
    public  final float VELOCIDAD_LUZ= 299792.458F;

    
    
    
    public  float calculoVoltaje(float resistencia, float intencidadCorriente){
        final int a=15;
        return resistencia*intencidadCorriente;
    }
    
}
