# A24-Bicloin

Distributed Systems 2020-2021, 2nd semester project.
Quorum based Crash Fault Tolerant (CFT) system using gRPC and Java.


## Authors

**Group A24**


92437 [Catarina Gonçalves](mailto:catarina.g.goncalves@tecnico.ulisboa.pt)

92456 [Duarte Bento](mailto:duarte.bento@tecnico.ulisboa.pt)

92560 [Susana Monteiro](mailto:s.moreno.monteiro@tecnico.ulisboa.pt)


### Module leaders

For each module, the README file must identify the lead developer and the contributors.
The leads should be evenly divided among the group members.

### Code identification

In all the source files (including POMs), please replace __A24__ with your group identifier.  
The group identifier is composed by Campus - A (Alameda) or T (Tagus) - and number - always with two digits.

This change is important for code dependency management, to make sure that your code runs using the correct components and not someone else's.


## Getting Started

The overall system is composed of multiple modules.

See the project statement for a full description of the domain and the system.

### Prerequisites

Java Developer Kit 11 is required running on Linux, Windows or Mac.
Maven 3 is also required.

To confirm that you have them installed, open a terminal and type:

```
javac -version

mvn -version
```

### Installing

To compile and install all modules:

```
mvn clean install -DskipTests
```

The integration tests are skipped because they require theservers to be running.


## Built With

* [Maven](https://maven.apache.org/) - Build Tool and Dependency Management
* [gRPC](https://grpc.io/) - RPC framework


## Versioning

We use [SemVer](http://semver.org/) for versioning. 
