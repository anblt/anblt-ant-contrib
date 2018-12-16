# Custom Ant Task :: XmlRefactor

### Description

- refactor .xml, .html, .svg, etc. files in different ways

### Usage

- rename element (composite or leaf) leaving it's attributes untouched

    <xmlrefactor outdir="${build.dir}" action="rename.element">
        <path>
            <fileset dir="${data.dir}" erroronmissingdir="false">
                <include name="colors1.xml" />
            </fileset>
        </path>
        <param key="match" value="colormap" />
        <param key="replace" value="colors" />
    </xmlrefactor>

- rename element attribute

    <xmlrefactor outdir="${build.dir}" action="rename.attribute">
        <path>
            <fileset dir="${data.dir}" erroronmissingdir="false">
                <include name="colors2.xml" />
            </fileset>
        </path>
        <param key="match" value="compliance" />
        <param key="replace" value="abc" />
    </xmlrefactor>

