# Custom Ant Selector :: ChecksumSelector

### Description

- selects files whose checksum matches their filename

### Usage

    <pathconvert property="findmatches" pathsep="${line.separator}">
    	<fileset dir="${build.dir}">
    		<include name="**/*.txt" />
    		<checksumselector algo="SHA-1" />
    	</fileset>
    </pathconvert>
    <echo>${findmatches}</echo>
