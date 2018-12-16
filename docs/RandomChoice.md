# Custom Ant Task :: RandomChoice

### Description

- select randomly `<count>` items and execute specified tasks (may have duplicates in its selection)

### Usage

- select `<count>` files from FileSet and echo their filepath

    ```
    <randomchoice param="val" count="3">
    	<fileset dir="${data.dir}" erroronmissingdir="false">
    		<include name="**/*" />
    	</fileset>
    
    	<sequential>
    		<echo>@{val}</echo>
    	</sequential>
    </randomchoice>
    ```
