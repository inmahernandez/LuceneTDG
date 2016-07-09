package org.apache.lucene.search.spell;

import java.util.List;

public class SuggestionTDG implements Comparable<SuggestionTDG> {

	private String suggestedWord;
	private List<DamerauLevenshteinOp> ops;
	private float score;

	public SuggestionTDG(String suggestedWord, float score, List<DamerauLevenshteinOp> ops) {
		super();
		this.suggestedWord = suggestedWord;
		this.score = score;
		this.ops = ops;
	}

	public String getSuggestedWord() {
		return suggestedWord;
	}

	public void setSuggestedWord(String suggestedWord) {
		this.suggestedWord = suggestedWord;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public List<DamerauLevenshteinOp> getOps() {
		return ops;
	}

	public void setOps(List<DamerauLevenshteinOp> ops) {
		this.ops = ops;
	}

	@Override
	public int compareTo(SuggestionTDG other) {
		return this.getScore() < other.getScore() ? -1 : 1;
	}

	
}
