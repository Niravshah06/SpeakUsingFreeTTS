package com.nirav.StringtoVoice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
/**
 * class used to gnerate voice from file,string or array of string using freeTTS api
 * @author Nirav
 *
 */
public class GenrateVoice {
	private String name;
	private Voice voice;

	public GenrateVoice(String name) {
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(this.name);
		this.voice.allocate();
	}
/**
 * speak single String
 * @param someline
 */
	public void speak(String someline) {
		this.voice.speak(someline);
	}
/**
 * speak multiple lines
 * @param multiline
 */
	public void speakMultiline(String[] multiline) {
		for (String s : multiline) {

			this.voice.speak(s);
		}
	}

	public void deallocate() {
		this.voice.deallocate();
	}
/*
 * 
 * speak file text
 */
	public void speakfromFile() {
		InputStream is = null;

		try {
			is = new FileInputStream("C:\\Users\\Nirav\\Desktop\\my learning java\\test.txt");
			this.voice.speak(is);

			is.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
