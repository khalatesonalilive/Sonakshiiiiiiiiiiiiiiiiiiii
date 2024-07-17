package UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindow extends BaseClass{

	static  Set<String>allwindid;
public static void handleWindow(int windowindex)
{
	
	allwindid=driver.getWindowHandles();
	
	Iterator<String>it=allwindid.iterator();
	
	ArrayList<String>arr=new ArrayList<>();	
	
	while(it.hasNext())
	{
	String winid=	it.next();
	arr.add(winid);
	}
	driver.switchTo().window(arr.get(windowindex));
}

	
}
