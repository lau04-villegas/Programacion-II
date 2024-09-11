/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import clases.Personas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laura
 */
public class datos_persona {
    private List<String> personasList;

    public datos_persona() {
        personasList = new ArrayList<>();
    }

    public void guardarPersona(Personas persona) {
        personasList.add(persona.toString());
    }

    public List<String> obtenerPersonas() {
        return personasList;
    }
}
