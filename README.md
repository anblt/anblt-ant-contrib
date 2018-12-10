# Custom Ant Tasks, Types, Selectors, Filters, Mappers

Collection of Custom Ant Tasks, Types, Selectors, Filters, Mappers to be used in build.xml ant build files

### Showcase for

- implementaton of custom ant tasks, types, filters, selectors, mappers
- configuration of ant properties via build.properties file
- registration of custom tasks, types, selectors, filters, mappers via typedef.properties


### Install .jar + Register ant tasks

1. Download .jar file
1. You now have the choice:
1.1 Copy the .jar file to the lib directory of your Ant installation (e.g. /usr/share/ant/lib/),
    or on your CLASSPATH environment variable. 
    If you want to use one of the tasks in your project, add the line
    ```
    <taskdef resource="anblt/ant/contrib/typedef.properties"/>
    ```
    to your build file. This will register the new tasks.

1.1 Keep the .jar in a separate location.
    You now have to tell Ant explicitly where to find it.
    ```
    <typedef resource="anblt/ant/contrib/typedef.properties">
      <classpath>
        <fileset dir="${lib.dir}" includes="*.jar" />
        <pathelement location="/path/to/anblt-ant-contrib.jar"/>
      </classpath>
    </typedef>
    ```


### Usage

- see build.xml
- see Documentation below


### Documentation

- [x] [<striphtmlcomments>/<stripxmlcomments>](docs/StripHtmlComments.md)
- [x] [<checksummapper>](docs/ChecksumMapper.md)
- [x] [<checksumselector>](docs/ChecksumSelector.md)


