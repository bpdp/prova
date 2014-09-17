Prova rule language (http://www.prova.ws)
=========================================

* September 2014: This fork is basically the same as Prova 3.2.1, but uses [Gradle](http://www.gradle.org) for automation tool. Prova now also uses newer / newest libraries since version 3.2.1 could be problematic in library dependency management when embedded into current software development project (not to mention that it also difficult to be improved), I've adjusted the source code for those two purposes.

Maintainer for this version is [Bambang Purnomosidi D. P.](http://bpdp.name).


Build
-----

`gradle build`

Clean
-----

`gradle clean`

Packaging
---------

`gradle jar`

* This gradle task will create 3 different jar files under `build/libs` directory: `ws.prova.compact-3.2.2.jar` (core), `ws.prova.compact-3.2.2-javadoc.jar` (API documentation), and `ws.prova.compact-3.2.2-sources.jar` (source code).

Original README
===============

Below is the original README.md file.

~~~
Prova rule language (http://www.prova.ws)
=========================================

Prova is an economic and efficient, Java JVM based, open source rule language for 
reactive agents and event processing. It combines imperative, declarative and 
functional programming styles. It is designed to work in distributed Enterprise 
Service Bus and OSGi environments.

The project is led by Alex Kozlenkov (Betfair Ltd., London, England) and Adrian 
Paschke (Free University, Berlin, Germany)

The issue control is maintained in Prova JIRA over at http://www.prova.ws/jira 
and the up-to-date documentation is available in Confluence at 
http://www.prova.ws/confluence.


Latest updates

27 January 2013: Prova 3.2.1 is released. The version is a significant update with 
new features, enhancements and quality improvements. It includes the new SPARQL 
operators contributed by the Berlin University team (Malte Rohde) and now updated 
for OSGi-compatible OpenRDF, faster messaging layer, corrected join operator in 
the event processing stack, improved packaging of the binary distribution. 
The Release Notes with the change log for version 3.2.1 are available from the 
Prova JIRA repository.
~~~
