package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost{
	private String text;
	private int likes;
	private boolean featured;

	public WallPostImpl(){
		text="Undefined post";
		likes=0;
		featured=false;
	}
	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		likes++;
	}

	@Override
	public void dislike() {
		if (likes>0){
			likes--;
		}
	}

	@Override
	public boolean isFeatured() {
		return featured;
	}

	@Override
	public void toggleFeatured() {
		featured = !featured;
	}

	/**
	 * Complete con su implementación
	 */

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */


}
