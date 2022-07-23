package org.System;

/*
 * Assignment1
===========
     Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.
 */

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop size is 15 inches");
	}
	
	public static void main(String[] args)
	{
		Desktop mycomp = new Desktop();
		mycomp.computerModel();
		mycomp.desktopSize();
	}

}
