# Custom Ant Task :: CsvJdbc

### Description

- run SQL queries against .csv files

### Usage

- save query result to file

    ```
    <csvjdbc csvdir="${data.dir}" outfile="${build.dir}/csvjsql.out" coltypes="Integer,Integer,Integer" append="True">
        <csvquery query="SELECT pow2, pow3 FROM numbers WHERE pow1 &gt;= 3 AND pow1 &lt; 7;" />
    </csvjdbc>
    ```

