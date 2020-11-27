package calculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class CO2Calculator {
	public static void main(String[] args) {
        
        /*Options options = new Options();
        
        Option opt1 = new Option("arg1", "transportation-method", true, "transportation option argument");
        opt1.setRequired(true); //this option is mandatory
        options.addOption(opt1);

        Option opt2 = new Option("arg2", "distance", true, "distance option");
        opt2.setRequired(true); //this option is mandatory
        options.addOption(opt2);
        
        Option opt3 = new Option("arg3", "unit-of-distance", true, "unit of distance option");
        options.addOption(opt3);
        
        Option opt4 = new Option("arg4", "output", true, "output option");
        options.addOption(opt4);

        CommandLineParser parser = new GnuParser();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args, true);
            
            //Terminate if mandatory arguments not present
            if(!cmd.hasOption("arg1") || !cmd.hasOption("arg2")) {
            	System.out.println("Insufficient parameters!!!!");
            	System.exit(1);
            }
            
            String transportMethod = cmd.getOptionValue("arg1");
            String distance = cmd.getOptionValue("arg2");
            
            double dist = Double.parseDouble(distance);
            
            //convert if unit of distance explicitly specified
            if(cmd.hasOption("arg3") && cmd.getOptionValue("arg3").equalsIgnoreCase("m"))
            	dist = dist/1000;
            
            CalculateEmission obj = new CalculateEmission();
            double result = obj.calculate(transportMethod, dist);
            
            if(cmd.hasOption("arg4") && cmd.getOptionValue("arg4").equalsIgnoreCase("g")) {
            	result = roundOffResult(result);
            	System.out.println("Your trip caused " + result + "g of CO2-equivalent.");
            }
            else {
            	result = result/1000;
            	result = roundOffResult(result);
            	System.out.println("Your trip caused " + result + "kg of CO2-equivalent.");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Exception Occured!!! Use the correct format and correct names as mentioned in README.md");
            System.exit(1);
        }*/
		
		/*String s = "lfpbavjsmppdtlkfwnyfmbdhptdswsoulrbhyjhpmpscfliuqnynejgnxolzbdoztclzbozqumvioszkulekcvcoqoymonrqgrjdtktsqtinmdcvservaxcbirnpfungsgkiftchwlmtbzqgaraovjknsgiegkvdbolmeunvrxrpscnfprodujeqtidwtoijgqtygovjknssmabwlhqjfvgwrdhaazejsfgilnpmmhkefndzvyonwpkzwwpdpbrudqmwmjschwnnjyoepxophc";
		int halfLen = s.length()/2;
		char max1 = 'a';
		char max2 = 'a';
		
		for(int i=0;i<halfLen;i++) {
			if(s.charAt(i)>max1)
				max1 = s.charAt(i);
		}
		
		for(int i=halfLen;i<s.length();i++) {
			if(s.charAt(i)>max2)
				max2 = s.charAt(i);
		}
		
		int countCase1 = 0;
		for(int i=0;i<halfLen;i++) {
			if(s.charAt(i)<max2)
				countCase1++;
		}
		
		int countCase2 = 0;
		for(int i=halfLen;i<s.length();i++) {
			if(s.charAt(i)<max1)
				countCase2++;
		}
		
		int countCase3 = 0;
		int freq[] = new int[26];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-97]++;
		}
		int tempMax = freq[0];
		for(int i=0;i<26;i++) {
			if(freq[i] > tempMax)
				tempMax = freq[i];
			
		}
		countCase3 = s.length()-tempMax;
		
		int min1 = Math.min(countCase1, countCase2);
		System.out.println("answer = " + Math.min(min1, countCase3));*/
		
		Age age1 = new Age();
	    age1.setDay(1);
	    age1.setMonth(1);
	    age1.setYear(1992);
	    
	    Age age2 = new Age();
	    age2 = age1;
	    
	    
	    age1.setYear(1234);
	    
	    System.out.println(age1.getDay());
	    System.out.println(age1.getMonth());
	    System.out.println(age1.getYear());
	    
	    
	    System.out.println(age2.getDay());
	    System.out.println(age2.getMonth());
	    System.out.println(age2.getYear());
	    
	    
    }
	

}