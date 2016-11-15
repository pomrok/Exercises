package com.tutorialspoint.inner_bean;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor." );
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
