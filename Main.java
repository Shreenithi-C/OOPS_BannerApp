class Main
{
 static class CharacterPatternMap
 {
   char character;
   String[] pattern;
   CharacterPatternMap(char character,String[] pattern)
   {
   this.character=character;
   this.pattern=pattern;
   }
   char getCharacter()
   {
   return character;
   }
   String[] getPattern()
   {
   return pattern;
   }
 }
 static CharacterPatternMap[] createCharacterPatternMaps()
 {
	 String oPattern[]={
    "   ***   ",
	" **   ** ",
	"**     **",
	"**     **",
	"**     **",
	" **   ** ",
	"   ***   "
	};
	String pPattern[]={
    " ******   ",
	" **    ** ",
	" **    ** ",
	" *******  ",
	" **       ",
	" **       ",
	" **       "
	};
	String sPattern[]={
	"  *****  ",
	" **      ",
	"**       ",
	"  *****  ",
	"      ** ",
	"**   **  ",
	" *****   "
	};
   CharacterPatternMap o=new CharacterPatternMap('O',oPattern);
   CharacterPatternMap p=new CharacterPatternMap('P',pPattern);
   CharacterPatternMap s=new CharacterPatternMap('S',sPattern);
   
   return new CharacterPatternMap[]{o,p,s};
 }
   static void printMessage(String word, CharacterPatternMap[] charMaps)
   {
   for(int row=0;row<7;row++)
   {
    for(int i=0;i<word.length();i++)
	{
	char ch=word.charAt(i);
	for(CharacterPatternMap cp:charMaps){
	if(cp.getCharacter()==ch){
	System.out.print(cp.getPattern()[row]+" ");
	}}
	}
	System.out.println();
   }
   }
 
 public static void main(String[] args)
 {
   
   CharacterPatternMap[] charMaps=createCharacterPatternMaps();
   printMessage("OOPS",charMaps);
}
}
   
   