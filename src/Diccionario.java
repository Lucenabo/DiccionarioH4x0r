
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucenabo
 */
public class Diccionario {
    TreeMap <String, String> diccionario = new TreeMap<>();
    
    public Diccionario() {
        diccionario.put("a", "4");
        diccionario.put("b", "I3");
        diccionario.put("c", "¢");
        diccionario.put("d", "?");
        diccionario.put("e", "£");
        diccionario.put("f","ph");
        diccionario.put("g","6" );
        diccionario.put("h", "1-1");
        diccionario.put("i", "!");
        diccionario.put("j", ";");
        diccionario.put("k", "1<");
        diccionario.put("l", "7");
        diccionario.put("m", "^^");
        diccionario.put("n", "И");
        diccionario.put("o", "0");
        diccionario.put("p", "9");
        diccionario.put("q", "&");
        diccionario.put("r", "Я");
        diccionario.put("s", "$");
        diccionario.put("t", "†");
        diccionario.put("u","µ");
        diccionario.put("v", "v");
        diccionario.put("w", "v²");
        diccionario.put("x", "Ж");
        diccionario.put("y", "¥");
        diccionario.put("z", ">_");
    }

    public TreeMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(TreeMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public String traducir(String texto) {
        String traduccion = "";
        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);
            if (diccionario.containsKey(letra)) {
                traduccion += diccionario.get(letra);
            } else {
                traduccion += letra;
            }
        }
        return traduccion;
    }
}
