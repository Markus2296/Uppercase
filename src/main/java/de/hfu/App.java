package de.hfu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class App
{
	/**
	 * 
	 * Programm zum Umwandeln in Großbuchstaben
	 */
    public static void main( String[] args ) throws IOException{

        System.out.println( "Bitte gebe die Zeichenkette ein!" );

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        s = s.toUpperCase();

        System.out.println(s);

    }
}
