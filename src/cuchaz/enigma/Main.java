/*******************************************************************************
 * Copyright (c) 2014 Jeff Martin.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Jeff Martin - initial API and implementation
 ******************************************************************************/
package cuchaz.enigma;

import java.io.File;

import cuchaz.enigma.gui.Gui;

public class Main
{
	public static void main( String[] args )
	throws Exception
	{
		startGui();
	}
	
	private static void startGui( )
	throws Exception
	{
		// settings
		final File jarFile = new File( "/home/jeff/.minecraft/versions/1.7.10/1.7.10.jar" );
		
		// start the GUI and tie it to the deobfuscator
		new Controller( new Deobfuscator( jarFile ), new Gui() );
	}
}
