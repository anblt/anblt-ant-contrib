# Custom Ant Filter :: StripHtmlComments

### Description

- strips single-line/multi-line XML/HTML-like comments from source-files like .html, .xml, .svg, etc.
- is able to recognise comments within (javascript) strings, which remain untouched

### Notes

- StripXmlComments is just an alias for StripHtmlComments

### Usage

- strip html comments from data/Comments.html producing cleaner build/Comments.html

    ```
    <copy todir="${build.dir}">
    	<fileset dir="${data.dir}">
    		<include name="Comments.html" />
    	</fileset>
    	<filterchain>
    		<striphtmlcomments />
    	</filterchain>
    </copy>
    ```

- `diff data/Comments.html build/Comments.html` then looks as follows

    ```
    8c8
    < <!--g1-->
    ---
    > 
    12,13c12,13
    <     <!---->
    <     <!-- -->
    ---
    >     
    >     
    17,20c17
    <     <!--gc2
    <     bXNnYm94
    <     egc2
    <     g2-->
    ---
    >     
    23,26c20
    < <!--123
    < <p class='bottom'>Some content here</p>
    < fdsfdskh
    < -->
    ---
    > 
    ```

    as you can see, single-line/multi-line comments were removed successfully
    

### Features / Known issues

- comments within strings remain untouched
    ```
    <script type="text/javascript">
        parent.document.title+='<!--';
        parent.document.title+="abc";
        parent.document.title+="-->";
    </script>
    ```

- comments within `<script>` tags are not supported yet
    ```
    <script type="text/javascript"><!--
        parent.document.title+="abc";
    //-->
    </script>
    ```
