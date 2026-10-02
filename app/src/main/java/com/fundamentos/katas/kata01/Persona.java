package com.fundamentos.katas.kata01;
import java.util.Objects;
/**
 * KATA 01 — Clases y objetos
 *
 * <p>Implementa una clase {@code Persona} inmutable:
 * <ul>
 *   <li>Constructor {@code Persona(String nombre, int edad)}.
 *     <ul>
 *       <li>Lanza {@link IllegalArgumentException} si el nombre es {@code null} o está en blanco.</li>
 *       <li>Lanza {@link IllegalArgumentException} si la edad es negativa.</li>
 *     </ul>
 *   </li>
 *   <li>{@code getNombre()} y {@code getEdad()}.</li>
 *   <li>{@code esMayorDeEdad()}: {@code true} si la edad es 18 o más.</li>
 *   <li>{@code toString()} devuelve exactamente: {@code Persona{nombre='Ana', edad=30}}</li>
 *   <li>{@code equals} / {@code hashCode}: dos personas son iguales si tienen el mismo nombre y edad.</li>
 * </ul>
 *
 * <p>Pista: los atributos deberían ser {@code private final}.
 */
public final class Persona {

    // TODO: declara los atributos
    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        // TODO: valida y asigna los atributos
        if ((nombre==null)||(nombre.isBlank())) {
            throw new IllegalArgumentException("El nombre es null o está en blanco");
        }else if (edad<0)
        {
            throw new IllegalArgumentException("la edad es negativa");
        } 
        else{
            this.nombre=nombre;
            this.edad=edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMayorDeEdad() {
        return edad>=18;
    }

    @Override 
    public String toString(){
        return "Persona{nombre='"+nombre+"', edad="+edad+"}";
    }

    @Override
    public boolean equals(Object obj) {
        // 1. ¿Son exactamente el mismo objeto en memoria?
        if (this == obj) return true;
        
        // 2. ¿El otro objeto es nulo o pertenecen a clases distintas?
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Convertir (cast) el objeto genérico al tipo de tu clase
        Persona persona = (Persona) obj;
        
        // 4. Comparar los atributos uno por uno
        // (Para números usa == y para textos usa java.util.Objects.equals)
        return edad == persona.edad && java.util.Objects.equals(nombre, persona.nombre);
    }


    @Override
    public int hashCode() {
        // Genera un número entero combinando los atributos del objeto
        return Objects.hash(nombre, edad);
    }

   
}
