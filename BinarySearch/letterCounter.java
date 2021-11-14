//letterCounter class is used within binarySearch class

public class letterCounter {
    private int count;
    private char letter;

    letterCounter (int count, char letter){
        this.count = count;
        this.letter = letter;
    }

    public void setLetter (char letter){
        this.letter = letter;
    }

    public void setCounter (int count){
        this.count = count;
    }

    public char getLetter(){
        return letter;
    }

    public int getCounter(){
        return count;
    }

    public boolean equals(letterCounter a) {
		if(this.letter==a.getLetter()) {
			return true;
		}
		else return false;
	}

	public int compareTo(letterCounter a) {
		if(this.letter<a.getLetter()) {
			return -1;
		}
		else if(this.equals(a)==true) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public String toString() {
		return (letter + " (" + count + ")");
	}
}
