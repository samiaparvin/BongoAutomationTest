## Prerequisites
•JDK 1.7 or above to check installation run: >java --version & >javac --version
•Make sure JAVA_HOME environment variable is set properly 
•apache maven to install- 
•unzip apache-maven-3.x.y.zip
•A directory called "apache-maven-3.x.y" will be created
•Add the bin directory to your PATHUnix-based operating systems (Linux, Solaris and Mac OS X)export PATH=/usr/local/apache-maven-3.x.y/bin:$PATHWindowsset PATH="c:\program files\apache-maven-3.x.y\bin";%PATH%
•Run "mvn --version" to verify that it is correctly installed.For complete documentation, see https://maven.apache.org/download.html#Installation
•Eclipse IDE For installation steps see: https://www.eclipse.org/downloads/packages/installer
•Selenium Webdriver
•For this project geckodriver is used.
•place geckodriver in C drive or in this location- C:\

## Clone project
1.Go to git project repository -> clone (copy clone URL)
2.Open Git Bash in any location where you want to keep the project.
3.Run $ git clone 

## Open Project
1.open Eclipse
2.Click File -> Open project from file system
3.Click on "Directory"
4.Select the project frm the directory where you have downloaded 
5.Click "Select folder"
6.Click "Finish"

For any kind inconvenience that may happen with project dependencies, the pom.xml content is added herewith-

## pom.xml

<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>SeleniumTest1</groupId>
	<artifactId>SeleniumTest1</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>SeleniumTest1</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-chrome-driver</artifactId>
			<version>3.141.59</version>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.9.9</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.sun.mail</groupId>
			<artifactId>javax.mail</artifactId>
			<version>1.6.0</version>
		</dependency>
	</dependencies>
</project>

