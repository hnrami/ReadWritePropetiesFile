package com.fop.fileprocess;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


/**
 * Hello world!
 *
 */
public class WritePropetiesFile 
{
    public static void main( String[] args )
    {
       
    	Properties prop = new Properties();
    	OutputStream output = null;

    	try {

    		output = new FileOutputStream("resource/statement.properties");

    		// set the properties value
    		prop.setProperty("Name", "Hemang");
    		prop.setProperty("City", "Mumbai");
    		prop.setProperty("Number", "123,213,420");

    		// save properties to project root folder
    		prop.store(output, null);

    	} catch (IOException io) {
    		io.printStackTrace();
    	} finally {
    		if (output != null) {
    			try {
    				output.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}

    	}
      }
        
    }

