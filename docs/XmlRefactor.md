# Custom Ant Task :: XmlRefactor

### Description

- refactor .xml, .html, .svg, etc. files in different ways

### Usage :: rename.element

- rename element (composite or leaf) leaving it's attributes/subelements untouched

    ```
    <xmlrefactor outdir="${build.dir}" action="rename.element">
        <path>
            <fileset dir="${data.dir}" erroronmissingdir="false">
                <include name="colors1.xml" />
            </fileset>
        </path>
        <param key="match" value="//colormap" />
        <param key="replace" value="colors" />
    </xmlrefactor>
    ```

- the corresponding diff shows the effect

    ```
    2c2
    < <colormap>
    ---
    > <colors>
    12c12
    < </colormap>
    ---
    > </colors>
    ```


### Usage :: rename.attribute

- rename element attribute

    ```
    <xmlrefactor outdir="${build.dir}" action="rename.attribute">
        <path>
            <fileset dir="${data.dir}" erroronmissingdir="false">
                <include name="colors2.xml" />
            </fileset>
        </path>
        <param key="match" value="//@compliance" />
        <param key="replace" value="abc" />
    </xmlrefactor>
    ```

- the corresponding diff shows the effect

    ```
    3,11c3,11
    <   <color name="none" color="rgba(0,0,0,0)" compliance="SVG, XPM"/>
    <   <color name="black" color="rgb(0,0,0)" compliance="SVG, X11, XPM"/>
    <   <color name="red" color="rgb(255,0,0)" compliance="SVG, X11, XPM"/>
    <   <color name="magenta" color="rgb(255,0,255)" compliance="SVG, X11, XPM"/>
    <   <color name="green" color="rgb(0,128,0)" compliance="SVG"/>
    <   <color name="cyan" color="rgb(0,255,255)" compliance="SVG, X11, XPM"/>
    <   <color name="blue" color="rgb(0,0,255)" compliance="SVG, X11, XPM"/>
    <   <color name="yellow" color="rgb(255,255,0)" compliance="SVG, X11, XPM"/>
    <   <color name="white" color="rgb(255,255,255)" compliance="SVG, X11"/>
    ---
    >   <color name="none" color="rgba(0,0,0,0)" abc="SVG, XPM"/>
    >   <color name="black" color="rgb(0,0,0)" abc="SVG, X11, XPM"/>
    >   <color name="red" color="rgb(255,0,0)" abc="SVG, X11, XPM"/>
    >   <color name="magenta" color="rgb(255,0,255)" abc="SVG, X11, XPM"/>
    >   <color name="green" color="rgb(0,128,0)" abc="SVG"/>
    >   <color name="cyan" color="rgb(0,255,255)" abc="SVG, X11, XPM"/>
    >   <color name="blue" color="rgb(0,0,255)" abc="SVG, X11, XPM"/>
    >   <color name="yellow" color="rgb(255,255,0)" abc="SVG, X11, XPM"/>
    >   <color name="white" color="rgb(255,255,255)" abc="SVG, X11"/>
    ```
