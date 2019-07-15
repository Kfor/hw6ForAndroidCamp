# hw6ForAndroidCamp

3170105468-武靖超-安卓开发作业6

本次仿照demo重新实现了一遍todolist。从零实现有些过于困难，故实现过程为弄明白了demo的逻辑后，主要依照其方法进行一遍尝试。在过程中，有以下需要注意的点做记录：

- 直接利用basic布局，可以生成带有右下角加号和右上角菜单的布局，对其添加字段并设置Intent来达到不同activity；

- sql使用的过程和嵌入式sql一致，申请cursor后在对象Note中查找字段。但注意加号只是字符串操作并不会给sql语句添加空格；
- Main和Note两个activity之间的转化，是通过Main监听float的click for result得来的，这样返回值后会回到Main中；
- 路径的存放都是用hashmap来对应实现的，每次（内私，外私，外共）都需要在dirMap中放入cache、file、custom的路径，才能放入canonical函数中；
- 数据表的自定义数据类型可以使用enum，方便限定有限的可能值。

