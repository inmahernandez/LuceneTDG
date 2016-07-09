package org.apache.lucene.search.spell;

public class DamerauLevenshteinOp {
	public enum Op {
		Insert, Delete, Replace, Swap, NoOP
	};

	// For insertion and deletion operations, just pos1 will be used; for
	// transpositions, pos1 and pos2 will be used
	private int pos = -1;
	// We will use values Insert, Delete, Change, Transpose
	private Op operation;
	// This string refers to a symbol in the dictionary
	private char typeOfSymbol;
	private int cost;
	private int prevI, prevJ;

	public DamerauLevenshteinOp(int i, char s, Op op, int cost, int prevI, int prevJ) {
		this.pos = i;
		this.operation = op;
		this.typeOfSymbol = s;
		this.cost = cost;
		this.prevI = prevI;
		this.prevJ = prevJ;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos1) {
		this.pos = pos1;
	}

	public Op getOperation() {
		return operation;
	}

	public void setOperation(Op operation) {
		this.operation = operation;
	}

	public char getTypeOfSymbol() {
		return typeOfSymbol;
	}

	public void setTypeOfSymbol(char typeOfSymbol) {
		this.typeOfSymbol = typeOfSymbol;
	}

	
	public int getCost() {
		return cost;
	}
	
	

	public int getPrevI() {
		return prevI;
	}

	public int getPrevJ() {
		return prevJ;
	}

	@Override
	public String toString() {
		return "(" + this.operation + ": " + this.pos + "; " + this.typeOfSymbol + ")";
	}
}
