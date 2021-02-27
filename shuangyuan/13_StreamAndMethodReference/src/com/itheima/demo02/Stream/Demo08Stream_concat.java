package com.itheima.demo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_concat:用于把流组合到一起
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo08Stream_concat {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        String[] arr = {"美羊羊","喜羊羊","懒羊羊","沸羊羊","暖羊羊"};
        Stream<String> stream2 = Stream.of(arr);

        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));
    }

}
