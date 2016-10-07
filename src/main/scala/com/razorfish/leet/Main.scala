package com.razorfish.leet

object Main {
		def main(args: Array[String]): Unit = {
			var res = convert(args.mkString(" "))								
	  	}	
	
		def convert(input: String): Unit = {
			var res = ""	
			for ( x <- input ) {
				 res = res + eachAlpha(x)						  	
      			}
			println(res)	
		}
		def eachAlpha(alpha: Char): String = alpha match {
    			case 'a' => "4"
			case 'A' => "4"
    			case 'b' => "6"
    			case 'B' => "6"
    			case 'b' => "("
    			case 'C' => "("
    			case 'd' => "[)"
    			case 'D' => "[)"
    			case 'e' => "&"
    			case 'E' => "&"
			case 'f' => "]]="
			case 'F' => "]]="
			case 'g' => "&"
			case 'G' => "&"
			case 'h' => "#"
			case 'H' => "#"
			case 'i' => "!"
			case 'I' => "!"
			case 'j' => ",|"
			case 'J' => ",|"
			case 'k' => "]{"
			case 'K' => "]{"
			case 'l' => "#"
			case 'L' => "#"
			case 'm' => "(\\/)"
			case 'M' => "(\\/)"
			case 'n' => "(\\)"
			case 'N' => "(\\)"
			case 'o' => "()"
			case 'O' => "()"
			case 'p' => "[]D"
			case 'P' => "[]D"
			case 'q' => "(,)"
			case 'Q' => "(,)"
			case 'r' => "12"
			case 'R' => "12"
			case 's' => "$"
			case 'S' => "$"
			case 't' => "']'"
			case 'T' => "']'"
			case 'u' => "(_)"
			case 'U' => "(_)"
			case 'v' => "\\/"
			case 'V' => "\\/"
			case 'w' => "'//"
			case 'W' => "'//"
			case 'x' => "%"
			case 'X' => "%"
			case 'y' => "/"
			case 'Y' => "'/"
			case 'z' => "/_"
			case 'Z' => "/_"
    			case _ => alpha.toString()
  		}	
	
}

