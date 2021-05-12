package unprotesting.com.github.Data.CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;  
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import unprotesting.com.github.Data.Persistent.TimePeriod;
import unprotesting.com.github.Data.Persistent.TimePeriods.ItemTimePeriod;

//Currently this reads a csv file and then creates two arrays of item names and prices which can then be used to set new prices

public class CSVReader 
{  
public static void main(String[] args) throws Exception 
{  
//Will need to change the path to location of the csv file
String path = "plugins/Auto-Tune/web/test.csv";
String line = "";
BufferedReader br = new BufferedReader(new FileReader(path));  
Integer numberOfItems = 200;
String[] items  = new String[numberOfItems];
Integer[] prices = new Integer[numberOfItems];
Integer lineNumber = 0;
while((line = br.readLine()) != null){
    if(line.length() > 0){
        lineNumber += 1;
        char percent = '%';
        char firstChar = line.charAt(0);
        if(firstChar == percent){
        items[lineNumber] = line.replaceAll("%", "");
        System.out.println(items[lineNumber]);
        }else{
            String[] values = line.split(",");
            prices[lineNumber] = Integer.parseInt(values[0]);  
            System.out.println(prices[lineNumber]);
                }
            }
        }
    }  
}  
