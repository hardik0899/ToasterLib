# ToasterLib(Version-1.0.0) [![](https://jitpack.io/v/hardik0899/ToasterLib.svg)](https://jitpack.io/#hardik0899/ToasterLib)


Toasts are one of the favourite classes used in android.. Therefore I made a library which depicts easy one line usage of Toast without importing in the projects in every class :)


So for adding this to your project just follow these stepps :->

Step 1. Add the JitPack repository to your build file.

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
dependencies {
  	implementation 'com.github.hardik0899:ToasterLib:1.0.0'
}
  
 Now, just sync your project and here you go.. wohoo ❤ now library is in your project folder you just have you follow these steps in order to use my library.
 
 
 So, write the following code in your MainActivity or any other activities and fragments.
 
 import hardik.lib.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.showToast(MainActivity.this, "Yeah, here we go :) We are able to generate a toast using Hardik's Toast-Lib library");
    }
}


Now, Run and Build the project and you will be able to see a Toast that will be generated with help of Hardik's Toast-Lib library which is easy to use.
