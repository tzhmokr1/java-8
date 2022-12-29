package com.learnJava.functionalInterfaces;

import java.util.function.*;

public class PrimitiveToPrimitive {

	public static void main(String[] args) {

		IntToDoubleFunction id = (i) -> { return Math.sin(i); };
		System.out.println(id.applyAsDouble(20));

		IntToLongFunction il = (x) -> Long.MAX_VALUE - x;
		System.out.println(il.applyAsLong(2));

		DoubleToIntFunction df = (x) -> { return (int) x + 2; };
		System.out.println(df.applyAsInt(3.14));

		DoubleToLongFunction dl = (x) -> { return Long.MAX_VALUE - (long) x; };
		System.out.println(dl.applyAsLong(3.14));

		LongToIntFunction li = (l) -> (int) l;
		System.out.println(li.applyAsInt(Long.MAX_VALUE));

		LongToDoubleFunction ld = (l) -> Math.sin(l);
		System.out.println(ld.applyAsDouble(Long.MAX_VALUE));
	}
}
