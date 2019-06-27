package com.cg.eis.Lab8;

	import java.io.*;
	class Ex4
	{
	public static void main(String args[])
	{
	File f1=new File("Libraries\\Documents\\Dilpreetsql");
	System.out.println("file name"+f1.getName());
	System.out.println("path"+f1.getPath());
	System.out.println("parent"+f1.getParent());
	System.out.println(f1.exists());
	System.out.println(f1.canRead());
	System.out.println(f1.canWrite());
	System.out.println(f1.isDirectory());
	System.out.println(f1.isFile());
	System.out.println(f1.lastModified());
	System.out.println(f1.length());
	System.out.println(f1.delete());
	}
	}


