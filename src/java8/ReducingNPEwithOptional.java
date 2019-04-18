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

import java.util.Optional;

/**
 * In this class we are exploring the usage of the Optional declaration 
 * to decrease the number of null pointer exceptions in the code (an errors)
 * @author Ali Adame
 * @see Optional in <link>https://www.udemy.com/lambda-java-8<link>
 */
public class ReducingNPEwithOptional {
    
    public static void main(String[] args) {
        System.out.println("A java class without logic to deal with nulls would have printed: "
                + "\"Hello, my name is: null\" when no name have been set");
        
        ReducingNPEwithOptional persona1 = new ReducingNPEwithOptional();
        System.out.println(persona1.introduction(new Persona()));
        
        ReducingNPEwithOptional persona2 = new ReducingNPEwithOptional();
        System.out.println(persona2.introduction(new Persona("Xocoyotzin")));
        
        ReducingNPEwithOptional persona3 = new ReducingNPEwithOptional();
        System.out.println(persona3.introductionWithOptional(new Persona()));
    }
    
    /**
     * An method that allows nulls
     * @param p representing the persona
     * @return String with an introduction
     */
    public String introduction(Persona p) {
        return "Hello, my name is: "+ p.getName();
    }
    
    /**
     * An method that does not allow nulls
     * @param p representing the persona
     * @return String with an introduction
     */
    public String introductionWithOptional(Persona p) {
        String name = Optional.ofNullable(p.getName()).orElse("Unknown");
        p.setName(name);
        return "Hello, my name is: "+ p.getName();
    }
}

/**
 * A dummy class
 * @author Ali Adame
 */
class Persona {
    int age;
    private String name;
    
    public Persona() {
        super();
    }
    
    public Persona(String name) {
        super();
        this.name = name;
    }
    
    public Persona(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
