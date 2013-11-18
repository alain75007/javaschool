package com.myschool.game;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
	/**
	 * Returns an Image object that can then be painted on the screen. 
	 * The url argument must specify an absolute {@link URL}. The name
	 * argument is a specifier that is relative to the url argument. 
	 * <p>
	 * This method always returns immediately, whether or not the 
	 * image exists. When this applet attempts to draw the image on
	 * the screen, the data will be loaded. The graphics primitives 
	 * that draw the image will incrementally paint on the screen. 
	 *
	 * @param  url  an absolute URL giving the base location of the image
	 * @param  name the location of the image, relative to the url argument
	 * @return      the image at the specified URL
	 * @see         Image
	 */
	 public Image getImage(URL url, String name) {
	        try {
	            return getImage(new URL(url, name), name);
	            
	        } catch (MalformedURLException e) {
	            return null;
	        }
	 }
	 /**
	  * Cette méthode est pour illustrer l'utilisation de Javadoc
	  * 
	 * @param monString un argument aléatoire
	 */

	public void maMethode(String monString) {
		 
	 }
}
