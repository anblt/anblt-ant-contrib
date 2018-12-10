# Custom Ant Mapper :: ChecksumMapper

### Description

- renames files according to the checksum of their contents (e.g. "SHA-1")

### Usage

    ```
    <copy todir="${build.dir}">
    	<fileset dir="${data.dir}">
    		<include name="**/*.txt" />
    	</fileset>
    	<checksummapper dir="${data.dir}" algo="SHA-1" />
    </copy>
    ```

