/*
 * The MIT License
 *
 * Copyright 2019 Ali Adame.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * This class shows the advantages to use streams in terms of what it means code readability 
 * declarations and lines of code
 * @author Ali Adame
 */
public class StreamObj {
    
    List<String> listStr;
    
    public StreamObj(String[] str) {
        listStr = Arrays.asList(str);
        
        listStr.stream().forEach((string) -> {
            System.out.println(string);
        });
        
        List<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona("Xocoyotzin", 21);
        Persona p2 = new Persona("Michael", 43);
        Persona p3 = new Persona("Xin", 18);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        
        personaToSortedListWithStreams(personas);
    }
    
    public List<String> getList() {
        return listStr;
    }
    
    /**
     * Converts a list of personas to a list of String using streams
     * @param personas list
     * @return List of String from a Persona list, sorted by age
     */
    public List<String> personaToSortedListWithStreams(List<Persona> personas) {
        List<String> listStr = new ArrayList<>();
        
        personas.sort((p1, p2) ->  p1.getAge() - p2.getAge());
        
        personas.stream().forEach(persona -> {
            if(listStr.add(persona.getName())) {
                System.out.println("Added to list: " + persona.getName());
            }
        });
        
        return listStr;
    }
    
    /**
     * Converts a list of personas to a list of String using streams
     * @param personas list
     * @return List of String from a Persona list, sorted by age
     */
    public List<String> personaToListWithoutStreams(List<Persona> personas) {
        List<String> listStr = new ArrayList<>();
        
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getAge() - p2.getAge();
            }
        });
        
        for(Persona persona : personas) {
            if(listStr.add(persona.getName())) {
                System.out.println("Added to list: " + persona.getName());
            }
        }
        
        return listStr;
    }
    
}
