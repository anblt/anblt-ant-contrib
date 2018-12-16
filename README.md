# Custom Ant Tasks, Types, Selectors, Filters, Mappers

Collection of Custom Ant Tasks, Types, Selectors, Filters, Mappers to be used in build.xml ant build files

### Showcase for

- implementaton of custom ant tasks, types, filters, selectors, mappers
- registration of custom tasks, types, selectors, filters, mappers via typedef.properties
- registration of additional tasks via antlib.xml


### Install .jar + Register ant tasks

1. Download .jar file

1. You now have the choice:

   - Copy the .jar file to the lib directory of your Ant installation (e.g. /usr/share/ant/lib/),
     or on your CLASSPATH environment variable. 
     If you want to use one of the tasks in your project, add the line
     ```
     <taskdef resource="anblt/ant/contrib/typedef.properties">
       <classpath>
         <fileset dir="${lib.dir}" includes="*.jar" />
       </classpath>
     </typedef>
     <typedef resource="anblt/ant/contrib/antlib.xml">
       <classpath>
         <fileset dir="${lib.dir}" includes="*.jar" />
       </classpath>
     </typedef>
     ```
     to your build file. This will register the new tasks.

   - Keep the .jar in a separate location.
     You now have to tell Ant explicitly where to find it.
     ```
     <typedef resource="anblt/ant/contrib/typedef.properties">
       <classpath>
         <fileset dir="${lib.dir}" includes="*.jar" />
         <pathelement location="/path/to/anblt-ant-contrib.jar"/>
       </classpath>
     </typedef>
     <typedef resource="anblt/ant/contrib/antlib.xml">
       <classpath>
     	 <fileset dir="${lib.dir}" includes="*.jar" />
     	 <path path="${ant.project.name}.jar" />
       </classpath>
     </typedef>
     ```


### Usage Example for Debian Linux
    
    root#> apt-get install openjdk-8-jre ant ant-contrib libcommons-lang3-java libcommons-io-java libcsvjdbc-java
    user$> mkdir lib
    user$> ln -t lib -s /usr/share/java/commons-io.jar /usr/share/java/commons-lang3.jar /usr/share/java/csvjdbc.jar

    # download .jar
    user$> wget https://github.com/anblt/anblt-ant-contrib/blob/master/anblt-ant-contrib.jar
    user$> ant -f build.xml


### Documentation

- [x] Filter [`<striphtmlcomments>`/`<stripxmlcomments>`](docs/StripHtmlComments.md)

  strips `<!-- ... -->` comments from .xml, .html, .svg, etc. files

- [x] FileNameMapper [`<checksummapper>`](docs/ChecksumMapper.md)

  renames arbitrary files to `<CHECKSUM>.<fileextension>`

- [x] FileSelector [`<checksumselector>`](docs/ChecksumSelector.md)

  select files if their name `<CHECKSUM>.<fileextension>` matches their actual checksum

- [x] Task [`<randomchoice>`](docs/RandomChoice.md)

  select randomly `<count>` items and execute specified tasks (may have duplicates in its selection)

- [x] Task [`<randomsample>`](docs/RandomSample.md)

  select randomly `<count>` items and execute specified tasks (does not have duplicates in its selection)

- [x] Task [`<csvjdbc>`](docs/CsvJdbc.md)

  run SQL queries against .csv files

- [x] Task [`<xmlrefactor>`](docs/XmlRefactor.md)

  refactor .xml, .html, .svg, etc. files in different ways


