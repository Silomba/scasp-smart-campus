
# SCASP — Stage 0 Build Verification Report

## 1. Project Information

**Project:** Smart Campus Academic Services Platform (SCASP)


**Stage:** 0 — Project Inception and Engineering Baseline

**GitHub Repository:** https://github.com/Silomba/scasp-smart-campus

**Branch:** stage/00-a-architecture-baseline

**GitHub Issue:** #1

**Pull Request:** #2

**Contributor:** Eli silomba-2024000453

**GitHub Username:** Silomba

**Role:** Member A — Architecture and Integration Lead

**Verification Date:** 12th Nov, 2026.

## 2. Development Environment

| Component        | Version |

| Operating System     | Windows 11 |
| IDE                  | Apache NetBeans 31 |
| Java Development Kit | JDK 21 |
| Apache Maven         
| Project Type | Maven Multi-Module |
| Java Compiler Release | 21 |

## 3. Build Objective

The purpose of this verification is to confirm that
the SCASP Maven project can be opened, compiled and
built successfully using Apache NetBeans.

This test establishes the Stage 0 engineering baseline
before implementation of the remaining features.

## 4. Build Procedure

1. Opened Apache NetBeans.
2. Opened the SCASP Maven parent project.
3. Verified that the seven modules were recognised.
4. Selected the parent project (scasp-parent).
5. Executed Clean and Build.
6. Examined the NetBeans output window.
7. Recorded the actual build result.



## 5. Maven Reactor Summary

Record the result of each module:


scasp-parent ................. SUCCESS
core-domain .................. SUCCESS
concurrent-processing ........ SUCCESS
network-gateway .............. SUCCESS
persistence-jdbc ............. SUCCESS
enterprise-services .......... SUCCESS
rmi-administration ........... SUCCESS
web-application .............. SUCCESS

BUILD SUCCESS

**Overall Build Result:** BUILD SUCCESS 

**Total Build Time:** 1:55 seconds

## 6. Automated Testing

**Tests executed:** 8
**Tests passed:**  8

**Tests failed:** 00

**Tests skipped:** 00

If no tests exist in the Stage 0 scaffold,
state this explicitly rather than claiming
that functionality has been tested.

## 7. Build Warnings and Errors

**Errors:**   None
**Warnings:** None

## 8. Build Evidence

cd C:\Users\ELI\Desktop\Scasp; "JAVA_HOME=C:\\Program Files\\Apache NetBeans\\jdk" cmd /c "\"C:\\Program Files\\Apache NetBeans\\java\\maven\\bin\\mvn.cmd\" \"-Dmaven.ext.class.path=C:\\Program Files\\Apache NetBeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress clean install"
Scanning for projects...
------------------------------------------------------------------------
Reactor Build Order:

SCASP - Smart Campus Academic Services Platform                    [pom]
core-domain                                                        [jar]
concurrent-processing                                              [jar]
network-gateway                                                    [jar]
persistence-jdbc                                                   [jar]
enterprise-services                                                [jar]
rmi-administration                                                 [jar]
web-application                                                    [war]

---------------------< zm.edu.scasp:scasp-parent >----------------------
Building SCASP - Smart Campus Academic Services Platform 1.0.0     [1/8]
  from pom.xml
--------------------------------[ pom ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ scasp-parent ---

--- install:3.1.4:install (default-install) @ scasp-parent ---
Installing C:\Users\ELI\Desktop\Scasp\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\scasp-parent\1.0.0\scasp-parent-1.0.0.pom

----------------------< zm.edu.scasp:core-domain >----------------------
Building core-domain 1.0.0                                         [2/8]
  from core-domain\pom.xml
--------------------------------[ jar ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ core-domain ---

--- resources:3.4.0:resources (default-resources) @ core-domain ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\core-domain\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ core-domain ---
Nothing to compile - all classes are up to date.

--- resources:3.4.0:testResources (default-testResources) @ core-domain ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\core-domain\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ core-domain ---
Nothing to compile - all classes are up to date.

--- surefire:3.5.2:test (default-test) @ core-domain ---
No tests to run.

--- jar:3.5.0:jar (default-jar) @ core-domain ---
JAR will be empty - no content was marked for inclusion!
Building jar: C:\Users\ELI\Desktop\Scasp\core-domain\target\core-domain-1.0.0.jar

--- install:3.1.4:install (default-install) @ core-domain ---
Installing C:\Users\ELI\Desktop\Scasp\core-domain\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\core-domain\1.0.0\core-domain-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\core-domain\target\core-domain-1.0.0.jar to C:\Users\ELI\.m2\repository\zm\edu\scasp\core-domain\1.0.0\core-domain-1.0.0.jar

-----------------< zm.edu.scasp:concurrent-processing >-----------------
Building concurrent-processing 1.0.0                               [3/8]
  from concurrent-processing\pom.xml
--------------------------------[ jar ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ concurrent-processing ---

--- resources:3.4.0:resources (default-resources) @ concurrent-processing ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\concurrent-processing\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ concurrent-processing ---
Recompiling the module because of changed dependency.

--- resources:3.4.0:testResources (default-testResources) @ concurrent-processing ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\concurrent-processing\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ concurrent-processing ---
Recompiling the module because of changed dependency.

--- surefire:3.5.2:test (default-test) @ concurrent-processing ---

--- jar:3.5.0:jar (default-jar) @ concurrent-processing ---
Building jar: C:\Users\ELI\Desktop\Scasp\concurrent-processing\target\concurrent-processing-1.0.0.jar

--- install:3.1.4:install (default-install) @ concurrent-processing ---
Installing C:\Users\ELI\Desktop\Scasp\concurrent-processing\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\concurrent-processing\1.0.0\concurrent-processing-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\concurrent-processing\target\concurrent-processing-1.0.0.jar to C:\Users\ELI\.m2\repository\zm\edu\scasp\concurrent-processing\1.0.0\concurrent-processing-1.0.0.jar

--------------------< zm.edu.scasp:network-gateway >--------------------
Building network-gateway 1.0.0                                     [4/8]
  from network-gateway\pom.xml
--------------------------------[ jar ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ network-gateway ---

--- resources:3.4.0:resources (default-resources) @ network-gateway ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\network-gateway\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ network-gateway ---
Recompiling the module because of changed dependency.

--- resources:3.4.0:testResources (default-testResources) @ network-gateway ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\network-gateway\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ network-gateway ---
Recompiling the module because of changed dependency.

--- surefire:3.5.2:test (default-test) @ network-gateway ---

--- jar:3.5.0:jar (default-jar) @ network-gateway ---
Building jar: C:\Users\ELI\Desktop\Scasp\network-gateway\target\network-gateway-1.0.0.jar

--- install:3.1.4:install (default-install) @ network-gateway ---
Installing C:\Users\ELI\Desktop\Scasp\network-gateway\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\network-gateway\1.0.0\network-gateway-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\network-gateway\target\network-gateway-1.0.0.jar to C:\Users\ELI\.m2\repository\zm\edu\scasp\network-gateway\1.0.0\network-gateway-1.0.0.jar

-------------------< zm.edu.scasp:persistence-jdbc >--------------------
Building persistence-jdbc 1.0.0                                    [5/8]
  from persistence-jdbc\pom.xml
--------------------------------[ jar ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ persistence-jdbc ---

--- resources:3.4.0:resources (default-resources) @ persistence-jdbc ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\persistence-jdbc\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ persistence-jdbc ---
Recompiling the module because of changed dependency.

--- resources:3.4.0:testResources (default-testResources) @ persistence-jdbc ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\persistence-jdbc\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ persistence-jdbc ---
Recompiling the module because of changed dependency.

--- surefire:3.5.2:test (default-test) @ persistence-jdbc ---

--- jar:3.5.0:jar (default-jar) @ persistence-jdbc ---
Building jar: C:\Users\ELI\Desktop\Scasp\persistence-jdbc\target\persistence-jdbc-1.0.0.jar

--- install:3.1.4:install (default-install) @ persistence-jdbc ---
Installing C:\Users\ELI\Desktop\Scasp\persistence-jdbc\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\persistence-jdbc\1.0.0\persistence-jdbc-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\persistence-jdbc\target\persistence-jdbc-1.0.0.jar to C:\Users\ELI\.m2\repository\zm\edu\scasp\persistence-jdbc\1.0.0\persistence-jdbc-1.0.0.jar

------------------< zm.edu.scasp:enterprise-services >------------------
Building enterprise-services 1.0.0                                 [6/8]
  from enterprise-services\pom.xml
--------------------------------[ jar ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ enterprise-services ---

--- resources:3.4.0:resources (default-resources) @ enterprise-services ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\enterprise-services\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ enterprise-services ---
Recompiling the module because of changed dependency.

--- resources:3.4.0:testResources (default-testResources) @ enterprise-services ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\enterprise-services\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ enterprise-services ---
Recompiling the module because of changed dependency.

--- surefire:3.5.2:test (default-test) @ enterprise-services ---

--- jar:3.5.0:jar (default-jar) @ enterprise-services ---
Building jar: C:\Users\ELI\Desktop\Scasp\enterprise-services\target\enterprise-services-1.0.0.jar

--- install:3.1.4:install (default-install) @ enterprise-services ---
Installing C:\Users\ELI\Desktop\Scasp\enterprise-services\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\enterprise-services\1.0.0\enterprise-services-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\enterprise-services\target\enterprise-services-1.0.0.jar to C:\Users\ELI\.m2\repository\zm\edu\scasp\enterprise-services\1.0.0\enterprise-services-1.0.0.jar

------------------< zm.edu.scasp:rmi-administration >-------------------
Building rmi-administration 1.0.0                                  [7/8]
  from rmi-administration\pom.xml
--------------------------------[ jar ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ rmi-administration ---

--- resources:3.4.0:resources (default-resources) @ rmi-administration ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\rmi-administration\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ rmi-administration ---
Recompiling the module because of changed dependency.

--- resources:3.4.0:testResources (default-testResources) @ rmi-administration ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\rmi-administration\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ rmi-administration ---
Recompiling the module because of changed dependency.

--- surefire:3.5.2:test (default-test) @ rmi-administration ---

--- jar:3.5.0:jar (default-jar) @ rmi-administration ---
Building jar: C:\Users\ELI\Desktop\Scasp\rmi-administration\target\rmi-administration-1.0.0.jar

--- install:3.1.4:install (default-install) @ rmi-administration ---
Installing C:\Users\ELI\Desktop\Scasp\rmi-administration\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\rmi-administration\1.0.0\rmi-administration-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\rmi-administration\target\rmi-administration-1.0.0.jar to C:\Users\ELI\.m2\repository\zm\edu\scasp\rmi-administration\1.0.0\rmi-administration-1.0.0.jar

--------------------< zm.edu.scasp:web-application >--------------------
Building web-application 1.0.0                                     [8/8]
  from web-application\pom.xml
--------------------------------[ war ]---------------------------------

--- clean:3.2.0:clean (default-clean) @ web-application ---

--- resources:3.4.0:resources (default-resources) @ web-application ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\web-application\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ web-application ---
Recompiling the module because of changed dependency.

--- resources:3.4.0:testResources (default-testResources) @ web-application ---
skip non existing resourceDirectory C:\Users\ELI\Desktop\Scasp\web-application\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ web-application ---
Recompiling the module because of changed dependency.

--- surefire:3.5.2:test (default-test) @ web-application ---

--- war:3.4.0:war (default-war) @ web-application ---
Packaging webapp
Assembling webapp [web-application] in [C:\Users\ELI\Desktop\Scasp\web-application\target\scasp]
Processing war project
Copying webapp resources [C:\Users\ELI\Desktop\Scasp\web-application\src\main\webapp]
Building war: C:\Users\ELI\Desktop\Scasp\web-application\target\scasp.war

--- install:3.1.4:install (default-install) @ web-application ---
Installing C:\Users\ELI\Desktop\Scasp\web-application\pom.xml to C:\Users\ELI\.m2\repository\zm\edu\scasp\web-application\1.0.0\web-application-1.0.0.pom
Installing C:\Users\ELI\Desktop\Scasp\web-application\target\scasp.war to C:\Users\ELI\.m2\repository\zm\edu\scasp\web-application\1.0.0\web-application-1.0.0.war
------------------------------------------------------------------------
Reactor Summary for SCASP - Smart Campus Academic Services Platform 1.0.0:

SCASP - Smart Campus Academic Services Platform .... SUCCESS [  0.614 s]
core-domain ........................................ SUCCESS [  3.014 s]
concurrent-processing .............................. SUCCESS [  0.583 s]
network-gateway .................................... SUCCESS [  0.617 s]
persistence-jdbc ................................... SUCCESS [  0.531 s]
enterprise-services ................................ SUCCESS [  0.842 s]
rmi-administration ................................. SUCCESS [  0.705 s]
web-application .................................... SUCCESS [  3.258 s]
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  10.787 s
Finished at: 2026-11-15T14:56:06+02:00
------------------------------------------------------------------------


### Screenshot 1 — NetBeans Build Result

![NetBeans Build](evidence/stage0/netbeans-build-success.png)

### Screenshot 2 — Maven Reactor Summary

![Maven Reactor](evidence/stage0/maven-reactor-summary.png)

### Complete Build Log

[View Build Log](evidence/stage0/maven-build-log.txt)



## 9. Independent Verification

**Member A:** [Result and evidence]

**Member B:** Pending independent verification

**Member C:** Pending independent verification

## 10. Conclusion

The Stage 0 build result is [actual result].

This verification concerns the Maven project
scaffold only. It does not establish that
registration, database, web, networking,
RMI or Android features are operational.

Functional testing will be performed as those
stages are implemented.

## 11. Peer Review

**Assigned Reviewer:** [Actual GitHub username]

**Review Status:** Pending

**Review Date:** Pending
