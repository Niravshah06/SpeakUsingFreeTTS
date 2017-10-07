package com.nirav.StringtoVoice;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Runner Class to genrateVoice class
 * 
 * @author Nirav
 *
 */
public class Runner {

	public static void main(String[] args) {
		// we have added mbrola voice with our fretts project
		
		//set property and give path where your mbrola folder is present
		System.setProperty("mbrola.base", "C:/somepath/mbrola/");// so that project can get mbrola voices

		System.out.println("voices avaiable");
		for (Voice v : VoiceManager.getInstance().getVoices()) {
			System.out.println(v.getName());

		}
		GenrateVoice g = new GenrateVoice("mbrola_us3");// select any voice availble, to add more voice read instrucion
														// file
		g.speak("hi divyaa you are amazing");
		g.speakfromFile();

		g.deallocate();
	}

}
