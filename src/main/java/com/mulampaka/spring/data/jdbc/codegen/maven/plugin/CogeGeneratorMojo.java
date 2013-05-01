/**
 * 
 * Copyright 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @author Kalyan Mulampaka
 */
package com.mulampaka.spring.data.jdbc.codegen.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mulampaka.spring.data.jdbc.codegen.CodeGenerator;

/**
 * Generate Spring Data Jdbc code from the database specified in
 * generator.properties
 * 
 * @author Kalyan Mulampaka
 * 
 * @goal generatecode
 * @phase compile
 * 
 */
public class CogeGeneratorMojo extends AbstractMojo
{
	private final Logger logger = LoggerFactory.getLogger (CogeGeneratorMojo.class);

	/**
	 * Generator properties file path
	 * 
	 * @parameter default-value="src/main/resources/codegenerator.properties"
	 * @required
	 * @readonly
	 */
	private String propertiesFile;
	
	public CogeGeneratorMojo ()
	{

	}
	
	public void execute () throws MojoExecutionException, MojoFailureException
	{
		logger.info ("*********** Starting Spring Data Jdbc code generation ... ***********");
		CodeGenerator generator = new CodeGenerator ();
		generator.setPropertiesFile (propertiesFile);
		generator.generate ();
		logger.info ("*********** Spring Data Jdbc code generation DONE. ***********");
	}
	
}
