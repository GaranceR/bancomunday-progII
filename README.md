# Project bancomunday - ProgII

## Contexto

> Creo que es un proyecto dificil pero todo estará bien. ;)

## File Tree

```
├── build                               | Location of *.class files
│   └── ../../*.class                   | and temporary files
│
├── build.gradle                        | To add build dependencies
├── gradle                              | Location fo the dependency wrapper
│   └── wrapper       
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew                             | Wrapper around gradle                     
├── gradlew.bat     
|
├── README.md                           | Please read me :-)
├── settings.gradle                     | Project's settings
|
└── src                                 | Location of the source code !
    ├── main
    │   ├── content
    │   │   └── Archivos                | Location of *.in files
    │   │       ├── Banco               | following the subject's
    │   │       │   └── *.in            | directory structure
    │   │       └── Cargas
    │   │           └── *.in
    │   └── java
    │       └── bancomunday             | Location of *.java files
    │           ├── bancoMundayImp.java | including the main !
    │           └── *.java
    └── test                            | Location of testing files
        ├── ...
        └── ...
```

## Guidelines and/or rules ?

* Write the code in **English** and comment everything in **Spanish**. :-)

* Follow a strict directory structure

* Create/update a backlog of what is left to do in the file named **TODO.md**

* Add code using new branches and not pushing to master without testing the code ! ;-)

* More to come..


## Instructions to run the project on your machine

### Install Gradle

Please follow ![this link](https://gradle.org/install/).

Check your gradle version by running :
```bash
gradle -version
```
The output must look like :
```bash
Welcome to Gradle 5.0!
```

> **Note** : You will probably need to install **Groovy** and other dependencies depending on your OS.

### Import the project into your IDE

Depends on your IDE :

* **Eclipse** :

> **Note** : Assumed you already installed Gradle Integration for Eclipse, the following steps are necessary to import the project to your Eclipse workspace:

> * Open the File > Import... dialog and select "Gradle Project" in the list.
* Select the root of your Gradle project.
* Press "Build Model"
* Select your project in the tree.


* **IntelliJ** :

> With IntelliJ IDEA up and running, click Import Project on the Welcome Screen, or File. Open on the main menu: In the pop-up dialog make sure to select either Maven's pom.xml or Gradle's build.gradle file under the complete folder: IntelliJ IDEA will create a project with all the code from the guide ready to run.


### Run the project !!

Here you go !
