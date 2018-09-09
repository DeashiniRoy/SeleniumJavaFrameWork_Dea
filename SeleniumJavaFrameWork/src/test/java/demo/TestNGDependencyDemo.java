package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods= {"test2","test3"},priority =1)
	public void test1(){
		System.out.println("I am inside Test1");
	}
	
	@Test(priority =2)
	public void test2(){
		System.out.println("I am inside Test2");
	}
	
	@Test
	public void test3(){
		System.out.println("I am inside Test3");
	}
	
	@Test(dependsOnGroups={"sanity1"})
	public void test4(){
		System.out.println("I am inside Test4");
	}
	@Test(groups ="sanity1")
	public void test5(){
		System.out.println("I am inside Test5");
	}
	

}
