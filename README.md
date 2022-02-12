# Programming Methodology I.

## Workspace

* Download and install the latest JDK: https://www.oracle.com/java/technologies/downloads/
* Set environment parameters:
  * On Windows in Commandline:
    * set JAVA_HOME=C:\Program Files\Java\jdk-17.0.2
    * set PATH=%JAVA_HOME%\bin;%PATH%
  * On Linux in Terminal:
    * export JAVA_HOME=/opt/jdk-17.0.2
    * export PATH=$JAVA_HOME/bin:$PATH
    
* Download and install Git: https://git-scm.com/download/win
* Download and install Maven: https://maven.apache.org/download.cgi
* Download and install IntelliJ IDEA: https://www.jetbrains.com/idea/download/#section=windows
* Clone this repository:
  * Click on green Clone button
  * Copy the URL
  * Start IntelliJ IDEA
  * Select File / New / Project from Version Control...
  * Enter the URL
  * Click on Clone button

## Project structure

* pom.xml
* src:
    * main:
        * java: sourcecode of the application - _You should write codes here._
        * resources: resources of the application
    * test (not part of application):
        * java: sourcecode of tests - _We will use it to test our methods._
        * resources: resources of tests