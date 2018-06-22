**Long methods**

I watched a talk on youtube by Douglas Hawkins from Azul Systems about Java performance puzzlers. This is my recreation of one of his examples. 

Which of these takes longer, manually summing ints from 0-1395 or 0 - 1396? When we say manually we mean writing out the code in long hand: 

`int x = 0;
x += 0;
x += 1;
...
x += 1395;`

(The code to generate this loop is in GenerateInput.java, and the loops are defined in LongMethods.java)

The benchmarks are in Benchmarks.java. 


`Benchmark              Mode  Cnt     Score     Error  Units`

`Benchmarks.sum0To1395  avgt    5     2.132 ±   0.449  ns/op`

`Benchmarks.sum0To1396  avgt    5  3113.475 ± 236.223  ns/op`

The slightly bigger sum takes WAY longer. Why is this?? 

If we run the following we can see the size of these 2 methods:

`javap -c target/classes/longmethods/LongMethods.class`

The first method is just below 8000 bytes:

 `7995: ireturn`

but the second method is just above: 

`8001: ireturn`


