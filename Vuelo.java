package com.javeriana.edu.taller;

public class Vuelo;

//atributos

private String codigo;
private String origen;
private String destino;
private int    disponibilidad;
private Pasajero pasajeros [];

//metodos

//constructor por defecto 
Vuelo(){}

//constructor por parametros

vuelo(String codigo, String origen, String destino, int disponibilidad, Pasajero pasajeros[]){
  
  this.codigo = codigo;
  this.origen = origen;
  this.destino = destino;
  this.disponibilidad = disponibilidad;
  this.pasajeros = pasajeros;
}

 //getters y setters

//getters
public String getCodigo(){
  return this.codigo;
}
public String getOrigen(){
  return this.origen;
}  
public String getDestino(){
  return this.destino;
}  
public int getDisponibilidad(){
  return this.disponibilidad;
}  
public Pasajero getPasajeros(){
  return this.pasajeros;
}  
  //setters
  
  
  public void setCodigo(String codigo){
   this.codigo = codigo;
 } 
  public void setOrigen(String origen){
   this.origen = origen;
 } 
  public void setDestino(String destino){
   this.destino = destino;
 } 
  public void setDisponibilidad(int disponibilidad){
   this.disponibilidad = disponibilidad;
 } 
 public void setPasajeros(Pasajero pasajeros){
   this.pasajeros = pasajeros;
 } 
  
}