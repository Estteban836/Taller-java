import java.util.*;

import java.util.*;
import java.lang.*;
import java.io.*;

    public class pasajero{

    //atributos
private String    nombres;
private String    apellidos;
private String    numeroDePasaporte;
private String    asiento;
private int       edad;

//metodos


//constructor por defect 

Pasajero(){}

//constructor con parametros 

Pasajero(String nombres, String apellidos, String numeroDePasaporte, String asiento, int edad){
  this.nombres = nombres;
  this.apellidos = apellidos;
  this.numeroDePasaporte = numeroDePasaporte;
  this.asiento = asiento;
  this.edad = edad;
}
//getters y setters

//getters
public String getNombres(){
  return this.nombres;
}
public String getApellidos(){
  return this.apellidos;
}
public String getNumeroDePasaporte(){
  return this.numeroDePasaporte;
}
public String getAsiento(){
  return this.asiento;
}
public int getEdads(){
  return this.edad;
  

//setters
  
 public void setNombres(String nombres){
   this.nombres = nombres;
 } 
 
 public void setApellidos(String apellidos){
   this.apellidos = apellidos  ;
 } 

public void NumeroDePasaporte(String numeroDePasaporte){
   this.numeroDePasaporte = numeroDePasaporte;
 } 
 
 public void setAsiento(String asiento){
   this.asiento = asiento;
 } 
 
 public void setEdad(int edad){
   this.edad = edad;
 } 
  
  
  
  
}


}