
interface XYZ{
    public String display();
}

enum ECardFace implements XYZ{
	JACK(11), QUEEN(12), KING(13), ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
	EIGHT(8), NINE(9), TEN(10);
	private int value;
	
	/* for compiler only */
	private ECardFace(int value){
		this.value = value;
	}

    public String display(){
        return toString();
    }

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

class Test1{
    public static void main(String args[]){
        System.out.println(ECardFace.valueOf("JACK"));
        System.out.println(ECardFace.valueOf("jack"));
    }
}

