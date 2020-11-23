package ua.academy.lgs;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Application {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {

		Bike Mustang = new Bike("Mustang", 2015, 26, "Road ");

		Class rb = Mustang.getClass();
		String canonicalName = rb.getCanonicalName();
		System.out.println(canonicalName);
		int modifiers = rb.getModifiers();
		System.out.println(modifiers);
		String modifiersString = Modifier.toString(modifiers);

		System.out.println(modifiersString);

		AnnotatedType annotatedSuperclass = rb.getAnnotatedSuperclass();
		System.out.println(annotatedSuperclass);

		Class[] interfaces = rb.getInterfaces();
		System.out.println(Arrays.toString(interfaces));

		Constructor<Bike>[] constructors = rb.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}

		System.out.println("");
		Constructor<Bike> constructor = rb.getConstructor(String.class, int.class, int.class, String.class);
		System.out.println(constructor);
		Bike newBike = constructor.newInstance("Ardis", 2018, 26, "Mountain");
		System.out.println(newBike);

		System.out.println("");
		Field[] fields = rb.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		System.out.println("");
		
		
		System.out.println(Mustang);
		Field newModelName = rb.getDeclaredField("modelName");
		newModelName.setAccessible(true);
		newModelName.set(Mustang, "Mustang v2.0");
		System.out.println(Mustang);
		System.out.println("");

		Method[] methods = rb.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		Method m1 = rb.getMethod("goOnTrip", Bike.class,String.class, int.class);
		Method m2 = rb.getMethod("goOnTrip", Bike.class, int.class);
		System.out.println(m1);
		System.out.println(m2);
		m2.invoke(newBike, newBike,  27);
		System.out.println("");
		m1.invoke(Mustang,Mustang, "Rome", 25);
		System.out.println("");
	}
}
