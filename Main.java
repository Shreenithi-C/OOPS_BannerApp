/* 
@author developer
@version 8
*/
import java.util.*;
class Main
{
public static HashMap<Character,String[]> createCharacterMap()
{
	HashMap<Character,String[]> map=new HashMap<>();
	map.put('O', new String[]{"   ***   ",
				  " **   ** ",
				  "**     **",
				  "**     **",
				  "**     **",
				  " **   ** ",
				  "   ***   "});
							  
	map.put('P', new String[]{" ******   ",
				  " **    ** ",
				  " **    ** ",
				  " *******  ",
				  " **       ",
				  " **       ",
				  " **       "});
							  
	map.put('S', new String[]{"  *****  ",
				  " **      ",
				  "**       ",
				  "  *****  ",
				  "      ** ", 
				  "**   **  ",
				  " *****   "});
	return	map;	
}

static void displayBanner(String message,HashMap<Character,String[]> charMap)
{
int patternHeight=charMap.get('O').length;
for(int i=0;i<patternHeight;i++)
{
	StringBuilder sb=new StringBuilder();
	for(char ch:message.toCharArray())
	{
	 String[] pattern=charMap.get(ch);
	 sb.append(pattern[i]).append(" ");
	}
	System.out.println(sb.toString());
}
}
	
public static void main(String[] args)
{
	HashMap<Character,String[]> charMap=createCharacterMap();
	String message= "OOPS";
	displayBanner(message,charMap);
}
}