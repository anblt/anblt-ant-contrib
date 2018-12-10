# Custom Ant Filter :: StripHtmlComments

### Description

- strips XML/HTML-like comments from source-files like .html, .xml, .svg, etc.
- is able to recognise comments within (javascript) strings, which remain untouched

### Notes

- StripXmlComments is just an alias for StripHtmlComments

### Usage

    <copy todir="${build.dir}">
    	<fileset dir="${data.dir}">
    		<include name="**/*.html" />
    	</fileset>
    	<filterchain>
    		<striphtmlcomments />
    	</filterchain>
    </copy>

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
