package athilabs;

import java.util.*;

/* 
 * Let's create a framework for card games
 */

/*
 * Every user declared enum will automatically extend java.lang.Enum class
 */
enum CardFace{
	
	/*
	 * Enum Constants
	 */
	JACK(11), QUEEN(12), KING(13), ACE(14), 
	TWO(2), THREE(3), FOUR(4), FIVE(5), 
	SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);
	/*
	 * Non-static members
	 */
	private int value;
	/*
	 * If we don't declare the below constructor the compiler will throw error
	 */
	private ECardFace(int value){
		this.value = value;
	}
	/*
	 * Overloaded methods
	 */ 
	@Override
	public String toString(){
		switch (this){
			case JACK:
				return "JACK";
			case QUEEN:
				return "QUEEN";
			case KING:
				return "KING";
			case ACE:
				return "ACE";
			default:
			    return "" + this.value;
		}
	}
};

enum CardType{
	
	SPADE, CLOVER, DIAMOND, HEART;
	/*
	 * Overloaded methods
	 */
	@Override
	public String toString(){
		switch (this){
			case SPADE:
				return "SPADE";
			case CLOVER:
				return "CLOVER";
			case DIAMOND:
				return "DIAMOND";
			case HEART:
				return "HEART";
		}
		return null;
	}
};

interface CardProperty{
	public void getType();
	public void getFaceValue();
}

/* 
 * Every CARD has both face and type - so aggregation is used 
 */
class Card implements CardProperty{	
	
	/* 
	 * faceType identifies either Juck, King, Queen, Ace or number 
	 */
	private CardFace cardFace;
	/* 
	 * cardType identifies either Clever, Spade, Heart, Diamond 
	 */
	private CardType cardType;
	
	private Card(){
		// is not allowed
	}

	public Card(CardFace cardFace, CardType cardType){
		this.cardFace = cardFace;
		this.cardType = cardType;
	}

	/*
	 * Overloaded methods
	 */
	@Override
	public void getType(){
		System.out.println(this.cardType);
	}

	@Override
	public void getFaceValue(){
		System.out.println(this.cardFace);
	}
	
	@Override
	public String toString(){
		return (this.cardFace.toString() + " " + this.cardType.toString()); 
	}	
}

interface CardOperators{
	public void showCards();
	public void shuffle();
	public void addCardIn(CardFace cf, CardType ct);
	public int  getCount();
}

abstract class AbstractCardStack implements CardOperators{
	
	Collection<ICard> cards;
	boolean multi_mode;
	int deck_count;

	/*
	 * Overloaded methods
	 */
	@Override 
	public void addCardIn(CardFace cf, CardType ct){
		//check the count and decide whether we can include the element or not.
		System.out.println("<WIP>");
	}

	@Override
	public int getCount(){
		return this.cards.size();
	}

	@Override
	public void shuffle(){
		if(this.cards != null){
			if(this.getCount() > 0){
				// WIP
				// Collections class will help! Need to ensure that it is working for all datastructures.
				System.out.println("<WIP>");
			}
			else
				System.out.println("<Don't have enough card to display!> <Bye!>");
		}
		else {
			System.out.println("<Error> Cards are not initialized.");
		}
	}

	@Override
	public void showCards(){
		Iterator carditerator = cards.iterator();
		while(true == carditerator.hasNext()){
			ICard tempcard = (Card) carditerator.next();
			tempcard.getType();
			tempcard.getFaceValue();
			carditerator.next();
		}
	}
}

/*
 * A deck has 52 cards
 */
class Deck extends AbstractCardStack{
	
	public Deck(){
		cards = new HashSet<ICard>();
		/*
	 	 * create card for each possibility
	     */ 
		for (CardFace cardface : CardFace.values()){
			for (CardType cardtype : CardType.values()){
				ICard tempCard = new Card(cardface, cardtype);
				cards.add(tempCard);		
			}
		}
	}
}

/*
 * A pile has more than one bundle of 52 cards
 * we need to pass the count to constructor to create a particular pile
 */
class Pile extends AbstractCardStack{
	
	private int deck_count;

	public Pile(){
		this(1);
	}

	public Pile(int count){
		this.deck_count = count;
		cards = new LinkedList<ICard>();

		/*
	 	 * create card for each possibility and no of bundles
	     */ 
		for (int i = 1; i <= this.deck_count; i++){
			for (CardFace cardface : CardFace.values()){
				for (CardType cardtype : CardType.values()){
					ICard tempCard = new Card(cardface, cardtype);
					cards.add(tempCard);		
				}
			}
		}
	}
}