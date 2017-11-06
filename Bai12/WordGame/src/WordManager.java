import java.util.ArrayList;

/**
 * Created by My PC on 06/11/2017.
 */
public class WordManager {
	private ArrayList<Word> listWord;
	private String category;
	
	public WordManager(String category) {
		this.category = category;
		listWord = new ArrayList<>();
	}
	public void addWord(String word, String vnMean){
		Word wordObj = new Word(word, vnMean);
		if(!listWord.contains(wordObj)){
			lis
		}
	}
}
