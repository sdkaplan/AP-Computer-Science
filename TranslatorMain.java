

public class TranslatorMain {
	public static void main (String[] args)
	{
		CanadianTranslator translator = new CanadianTranslator(", eh");
		
		// Task 1:  Create a Translator class that translates this.
		String translated = translator.translate("How's the weather");
		System.out.println(translated);
		//Should print out "How's the weather, eh"
		
		// Task 2:  Modify the Translator class to also replace "about" with "aboot".
		// Look through the String methods for something that will help.
		translated = translator.translate("It's about time");
		System.out.println(translated);
		//Should print out "It's aboot time, eh"
		
		/////////  Completing the two tasks above is sufficient for submission
		
		// When you're done with the above, try your hand at these extras:
		
		//
		// Extra 1: Create a CalifornianTranslator that inserts a given phrase (for example, ", like, totally")
		//          after "is" and "are"
		/*
		CalifornianTranslator firstCaliTranslator = new CalifornianTranslator(", like, omigosh, ");
		translated = firstCaliTranslator.translate("That book is so heavy.");
		System.out.println(translated);
		// Should print out "That book is, like, omigosh, so heavy.";
		CalifornianTranslator secondCaliTranslator = new CalifornianTranslator(", like, totally");
		translated = secondCaliTranslator.translate("We are programmers, and it is great.");
		System.out.println(translated);
		// Should print out "We are, like, totally programmers, and it is, like, totally great.";
		*/
		
		// Extra 2: Modify the CanadianTranslator class to place the suffix between punctuation marks.
		// Look through the String methods for things that will help, such as length, substring and endsWith.
		// [this requires if statements]
		/*
		translated = translator.translate("About when were you thinking of going to class?");
		System.out.println(translated);
		// Should print out "Aboot when were you thinking of going to class, eh?";
		*/
		
		// Extra 3: Translate to pig latin.  [this requires if statements.  You may want to make a "startsWithVowel" method]
		//          There are rules on Wikipedia, but we'll simplify this a bit.
		//  1.If the word begins with a consonant, move the first letter to the end of the word
		//    and add "ay"
		//        "happy" → "appyhay"
		//        "duck" → "uckday"
		//  2.For words that begin with a voewl, you just add "way" to the end.
		//        "egg" → "eggway"
		//        "inbox" → "inboxway"
		//        "eight" → "eightway"
		/*
		PigLatinTranslator thirdTranslator = new PigLatinTranslator();
		translated = thirdTranslator.translate("How much wood can a woodchuck chuck?");
		System.out.println(translated);
		// should print "Owhay uchmay oodway ancay away oodchuckway huckcay"
		*/
	}
}
