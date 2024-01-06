package MethodRefrences;

public class ExecutionClass {

	public void executionClassMethod() {
		System.out.println("Here is Refer method Execution Class");
	}

	//Steps required
	//Need one Functional Interface which have one abstract method
	//Need one Execute class 
	//add one Method in same class  which is refer to Interface method
	//Create a Object of class
	// Iterface refrenceVariable= Object_Of_Class :: Method of Created Object class
	//Callig:- refrenceVariable.Interface Method

	
	public static void main(String[] args) {
		ExecutionClass e = new ExecutionClass();

		InterfaceTest1 i = e::executionClassMethod;
		
		i.interfaceMethod();

	}
}
